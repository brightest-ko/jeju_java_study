package temp;

import java.io.*;

public class Test080{
	public static void main(String[] args) throws IOException{
		InputStream in = new FileInputStream("a.dat");
		OutputStream out = new FileOutputStream("b.dat");
		
		/*
		while(true){
			int r = in.read();
			if(r == -1) break;
			out.write(r);
		}
		*/
		
		int r = 0;
		while((r=in.read())!= -1){
			out.write(r);
		}
	}
}

//javac -d . Test080.java
//java -classpath . temp.Test080 / java temp.Test080


//dir *.dat / type b.dat