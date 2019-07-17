//조상
class A{
	void print(){
		System.out.println("A print");
	}
}

//자손
class B extends A{
	//똑같은 함수를 두번 선언하면 안된다. 그러나 에러가 나지 않는다. 왜?
	void print(){
		System.out.println("B print");
		super.print();
	}
}
public class Test031{
	public static void main(String[] args){
	
		B t = new B();
		//자손에서 재정의한 것이 나온다!
		t.print();
//		t.super.print();
		
		A t2 = new A();
		t2.print();
		
		
	}
}
