package temp;
//import java.net.ServerSocket;
//import java.net.Socket;
import java.net.*;

//Server
public class Test083S{
	public static void main(String[] args) throws Exception{
		ServerSocket svr = new ServerSocket(1123); //ipconfig
		System.out.println("before accept()");
		Socket skt = svr.accept();
		System.out.println("after accept()");
		
		skt.close();
		svr.close();
	}
}