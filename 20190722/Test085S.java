package temp;
//import java.net.ServerSocket;
//import java.net.Socket;
import java.net.*;
import java.io.*;

//Server
public class Test085S{
	public static void main(String[] args) throws Exception{
		ServerSocket svr = new ServerSocket(1123); //ipconfig
		System.out.println("before accept()");
		Socket skt = svr.accept();
		System.out.println("after accept()");
		
		
		
		InputStream in = new FileInputStream("C:\\A\\jdk-6u30-apidocs.zip");
		OutputStream out = skt.getOutputStream();
		
		int r = 0;
		byte[] buf = new byte[1024*8];
		while((r=in.read(buf))!= -1){
			out.write(buf, 0, r);
				
		}
		out.flush();
		out.close();
		in.close();
		
		
		
		
		skt.close();
		svr.close();
	}
}
//javac -d . Test083_2*.java
//java -classpath . temp.Test083_2S

//새 커맨드창
//java -classpath . temp.Test083_2C