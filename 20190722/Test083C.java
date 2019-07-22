package temp;
import java.net.Socket;

//Client
public class Test083C{
	public static void main(String[] args) throws Exception{
		Socket skt = new Socket("192.168.2.49",1123); //ipconfig
		skt.close();
	}
}