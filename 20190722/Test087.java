package temp;
import java.net.Socket;
import java.io.*;

/*
	OutputStream InputStream : ���۴��� byte : ���̳ʸ� ���� ���ۿ�
	Reader Writer : ���۴��� char : ���ڷ� �� ������ ���ۿ�
	
	char�� 2����Ʈ��, �����ڵ带 �����Ѵ�.
	�����ڵ�� ��� ���ڸ� �� �������� ���Ѵ�. (6���� ����)
	-������ ���ڸ� �����Ѵ�. �ѱ� +���� +�߱��� +�ƶ��� +�Ϻ���..
	
	Ȯ�尡���� �������̸� ������ ����ü���� ���� : URF-8 (��ǥ��)
	
*/
public class Test087{
	public static void main(String[] args) throws Exception{
		Writer out = new OutputStreamWriter(new FileOutputStream("a.txt")); //char������� byte��������� �ٲ��ش�.
		out.write("��");
		out.write('�');
		out.close();
		
		Reader in = new InputStreamReader(new FileInputStream("a.txt"));
		System.out.println((char)in.read());
		System.out.println((char)in.read());
		System.out.println((char)in.read());
		in.close();
	}
}
//�� ��