package temp;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class Test077{
	public static void main(String[] args){
		try{
			OutputStream out = new FileOutputStream("a.dat");
		}catch(FileNotFoundException e){
		
		}
	}
}

//javac -d . Test076.java
//java classpath . temp.Test076