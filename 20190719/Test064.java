import temp.Test064A;
public class Test064{
	public static void main(String[] args){
		Test064A t = null;
	}
}
/*
	//temp파일을 c;a폴더로 옮겨감
	javac -classpath c:\a\ Test064.java
	java -classpath .;c:\a\ Test064
	// 064는 현재디렉토리에 있으니 . / 064A 디렉토리는 c:\a\
	
	-classpath 옵션을 안주면 -classpath . 을 기본으로 준다.
	
	다른 패키지의 클래스는 반드시 명시해야 사용할 수 있다.
	만일 그래도 크래스를 못찾으면, 클래스의 위치를 지정해 주어야 한다.
*/