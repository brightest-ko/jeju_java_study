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
	java.io 패키지가 데코레이터 패턴이라는 설계기법으로 구현되었다.
	-HelloGreet MerciGreet StarDeco SharpDeco : 데코레이터 패턴의 예제
	
	1바이트씩 복사하는 코드 짜세요.
*/