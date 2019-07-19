import java.lang.reflect.Method;

import temp.PrintStars;
import java.lang.annotation.Annotation;

public class Test067_2{
	public static void main(String[] args) throws Exception{
		Class<?> cls = Class.forName("temp.Test067");
		Object obj = cls.newInstance();
		
		Method mtd = cls.getMethod("print");
		System.out.println(mtd); //public int temp.Test067.print()
		
		Annotation anot = mtd.getAnnotation(PrintStars.class);
		Object r = mtd.invoke( obj );
		if(anot != null){
			System.out.println("**");
		}
		System.out.println(((Integer)r).intValue()); //@temp.PrintStars()
	}
}

//javac Test067_2.java
//java -classpath C:\A\;. Test067_2

//javac -classpath C:\A\ Test067_2.java
//java -classpath C:\A\;. Test067_2