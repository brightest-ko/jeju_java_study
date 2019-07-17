abstract class A{
//선언됐지만 정의되지 않았다.
//abstract 메소드를 하나라도 가진 클래스는 abstract클래스라고 정의해야 한다.
	abstract public void print();
}
class B extends A{
//abstract메소드를 오버라이딩하면 abstract 성질이 없어지게 된다.
	public void print(){
		System.out.println(100);
	}
}s

public class Test035{
	public static void main(String[] args){
		A t = new B();
		t.print();

	}
}

