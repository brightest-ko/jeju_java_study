package temp;

import java.io.*;

public class Test080{
	public static void main(String[] args) throws IOException{
		InputStream in = new FileInputStream("C:\\A\\PostView.htm");
		OutputStream out = new FileOutputStream("C:\\A\\b.htm");
		
		while(true){
			int r = in.read();
			if(r == -1) break;
			out.write(r);
		}
	}
}

//javac -d . Test080.java
//java -classpath . temp.Test080 / java temp.Test080