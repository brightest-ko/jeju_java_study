class A{
	int i=100;
}

class B extends A{
	int i=200;
}

public class Test041{
	public static void main(String[] arg){
		A t = new B();
		System.out.println(t.i);
		
		// t 포인터가 가리키는 인스턴스를 감싸는 B클래스 인스턴스를 t2 가 가르킨다.
		B t2 = (B)t;
		System.out.println(t2.i);
		
	}
}