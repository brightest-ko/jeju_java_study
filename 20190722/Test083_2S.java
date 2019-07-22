package temp;
//import java.net.ServerSocket;
//import java.net.Socket;
import java.net.*;
import java.io.*;

//Server
public class Test083_2S{
	public static void main(String[] args) throws Exception{
		ServerSocket svr = new ServerSocket(1123); //ipconfig
		System.out.println("before accept()");
		Socket skt = svr.accept();
		System.out.println("after accept()");
		
	
		OutputStream out = skt.getOutputStream();		
		out.write(65);
		out.flush();
		out.close();
		
		
		
		
		skt.close();
		svr.close();
	}
}
//javac -d . Test083_2*.java
//java -classpath . temp.Test083_2S

//새 커맨드창
//java -classpath . temp.Test083_2C