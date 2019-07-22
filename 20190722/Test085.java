package temp;
import java.net.Socket;
import java.io.*;

public class Test085{
	public static void main(String[] args) throws Exception{
		OutputStream out = new FileOutputStream("d.dat");
		out.writer(10101);
		out.writer(10102);
		out.writer(10103);
		//이거 왜 깨지는지? 4Byte 다 보내는게 아니더라..
		out.close();
		
		InputStream in = new FileInputStream("d.dat");
		int a = in.read();
		int b = in.read();
		int c = in.read();
		int d = in.read();
		in.close();
		
		System.out.prinln(a);
		System.out.prinln(b);
		System.out.prinln(c);
		System.out.prinln(d);
	}
}
