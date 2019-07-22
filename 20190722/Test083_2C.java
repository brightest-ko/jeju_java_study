package temp;
import java.net.Socket;
import java.io.*;

//Client
public class Test083_2C{
	public static void main(String[] args) throws Exception{
		Socket skt = new Socket("192.168.2.58",1123); //ipconfig
		
		
		InputStream in = skt.getInputStream();
		int r=in.read();
		System.out.println(r);
		in.close();
		
		skt.close();
	}
}