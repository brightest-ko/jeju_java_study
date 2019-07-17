class A{
	A(){System.out.println("A constructor");}
}
class B extends A{
	B(){System.out.println("B constructor");}
}
public class Test030{
	public static void main(String[] args){
	
		B t = new B();
		t.A();
		
	}
}
/*
	상속관계가 존재할 떄 (보통 조상클래스, 자손클래스) 자손의 인스턴스를 생성하면,
	조상의 생성자가 먼저 호출되고, 자손의 생성자가 호출된다.
	
	생성자는 상속되지 않습니다. 다만 호출될 뿐이다.  왜냐하면 멤버함수도 아니므로.
	참조형 변수로 호출할 수 없다.
	*/
