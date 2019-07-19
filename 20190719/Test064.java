pakage temp;
public class Test064A{
	public int print(){return 200;}
	public int print2(int i){return 300*i;}
	
	public int print3(){return 100;}
	
}

/*
	패키지가 지정된 클래스 컴파일 : javac -d [폴더] Test064A.java
	
	패키지가 클래스의 묶음 . 파일 맨 위에 지정.
	이 파일안에 선언한 모든 클래스는 지정된 패키지에 속한다.
	
	javac -d . Test064A.java
*/