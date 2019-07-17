class Apple2{
	int data = 0;
	int add(int i, int j){return 100;}
}
//멤버변수(property), 멤버함수(method)
//클래스로 뭐하지? 참조형 변수 선언, 인스턴스 생성
//인스턴스와 클래스 관계, 참조형 변수와 인스턴스 관계

public class Test026{
	public static void main(String[] args){
		Apple2 t = new Apple2();
		int i = t.add(10,20);
	}
}