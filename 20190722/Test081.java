package temp;

import java.io.*;

public class Test081{
	public static void main(String[] args) throws IOException{
		InputStream in = new FileInputStream("C:\\A\\jdk-6u30-apidocs.zip");
		OutputStream out = new FileOutputStream("C:\\A\\b.zip");
		
		//��û���� ����. �ܿ�ÿ�
		int r = 0;
		byte[] buf = new byte[1024*8];
		while((r=in.read(buf))!= -1){
			out.write(buf, 0, r);
		}
		in.close();
		out.close();
	}
}

//javac -d . Test081.java
//java -classpath . temp.Test081 / java temp.Test081
