package temp;
import java.net.Socket;
import java.io.*;

/*
	OutputStream InputStream : 전송단위 byte : 바이너리 파일 전송용
	Reader Writer : 전송단위 char : 문자로 된 데이터 전송용
	
	char는 2바이트고, 유니코드를 지원한다.
	유니코드는 모든 글자를 다 포용하지 못한다. (6만자 제한)
	-웬만한 글자를 포용한다. 한글 +영문 +중국어 +아랍어 +일본어..
	
	확장가능한 가변길이를 가지는 문자체제를 조입 : URF-8 (웹표준)
	
*/
public class Test087{
	public static void main(String[] args) throws Exception{
		Writer out = new OutputStreamWriter(new FileOutputStream("a.txt")); //char입출력을 byte입출력으로 바꿔준다.
		out.write("한");
		out.write('亞');
		out.close();
		
		Reader in = new InputStreamReader(new FileInputStream("a.txt"));
		System.out.println((char)in.read());
		System.out.println((char)in.read());
		System.out.println((char)in.read());
		in.close();
	}
}
//펲 뷁