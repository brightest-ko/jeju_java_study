package temp;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class Test076_2{
	public static void main(String[] args) throws FileNotFoundException{
			OutputStream out = new FileOutputStream("a.dat");
	}
}

//javac -d . Test076.java
//java classpath . temp.Test076