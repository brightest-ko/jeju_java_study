package temp;
import java.net.Socket;
import java.io.*;

//Client
public class Test084{
	public static void main(String[] args) throws Exception{
		InputStream in = new BufferedInputStream( new FileInputStream("C:\\A\\jdk-6u30-apidocs.zip"));
		OutputStream out = new BufferedOutputStream( new FileOutputStream("C:\\A\\c.zip"));
		
		int r = 0;
		while((r=in.read())!=-1){
			out.write(r);
		}
		
		in.close();
		out.close();
	}
}

/*
	java.io ��Ű���� ���ڷ����� �����̶�� ���������� �����Ǿ���.
	-HelloGreet MerciGreet StarDeco SharpDeco : ���ڷ����� ������ ����
	
	1����Ʈ�� �����ϴ� �ڵ� ¥����.
*/