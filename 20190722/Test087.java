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
public class Test086{
	public static void main(String[] args) throws Exception{
		Writer out2 = new FileWriter("a.txt"); //char ���� /Stream 1����Ʈ����
		out2.write("��");
		out2.write('�');
		out2.close();
		
		Reader in = new FileReader("a.txt");
		System.out.println((char)in.read());
		System.out.println((char)in.read());
		System.out.println((char)in.read());
		in.close();
	}
}
//�� ��