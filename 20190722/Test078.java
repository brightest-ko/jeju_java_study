
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test078{
	public static void main(String[] args) throws IOException{
		OutputStream out = new FileOutputStream("a.dat");
		out.write(65); //A
		out.write(66); //B
		out.write(67); //C
		out.close();
	}
}

/*

	FileOutputStream : ���Ͽ� �����ϴ� ����� �����Ѵ�.
	OutputStream : �������� ����� �߻�ȭ �� Ŭ����
	(�̰� ��ӹ��� Ŭ������, �̰ɷ� ����ų �� �ְ�, �̰Ϳ� ����ȰŸ� ����)
	
	write: �ѹ��� 1����Ʈ�� �������µ�, �������̵� �� write �� ȣ��ȴ�.
	(api���ϱ�), �������̵� �� write�� �Ű������� ���� a.dat ���Ͽ� �����ϰ� �ȴ�.
	
	close(): �������� ��θ� �ݰ�, ��ó���� �� �ش�.
	
	AppleOutputStream extends OutputStream ...
	���·� ����Ǿ����ٰ� �� ġ��, �ν��Ͻ��� �ٲٸ� �������� �ٲ� �ʿ� ����.
*/