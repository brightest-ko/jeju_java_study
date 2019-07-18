class Temp{
	int i=100;
	static void print(){System.out.println(i);} // static한 멤버 함수 안에서 non-static한 멤버함수, 변수에 접근할 수 없다. 인스턴스 생성이 되지 않아 사용할 수 없다.
}


public class Test043{
	public static void main(String[] arg){
		Temp.print();
	}
}