package temp;
import java.net.Socket;
import java.io.*;

//Client
public class Test085C{
	public static void main(String[] args) throws Exception{
		Socket skt = new Socket("192.168.2.11",1123); //ipconfig
		
		
		InputStream in = skt.getInputStream();
		OutputStream out = new FileOutputStream("C:\\A\\hello.txt");
		
		//엄청많이 쓴다. 외우시오
		int r = 0;
		byte[] buf = new byte[1024*8];
		while((r=in.read(buf))!= -1){
			out.write(buf, 0, r);
		}
		in.close();
		out.close();
		
		
		skt.close();
	}
}