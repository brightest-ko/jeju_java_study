class A{
	int i=100;
	void print(){System.out.println("A print");}
}

class B extends A{
	int i=200;
	void print2(){System.out.println("B print");}
	void print(){System.out.println("B print");}
}
public class Test031_1{
	public static void main(String[] args){

		//조상타입의 변수로 자손의 인스턴스를 가리킬 수 있다.
		A t = new B(); //만들어진 인스턴스에는 print2가 존재하지만
		t.print();
		//조상에서 선업된것은 가능하지만, 자손에서 추가된 것은 안됨
		//존재하지만, 호출이 가능하지 않다.
//		t.print2();
		System.out.println(t.i);
		
	}
}
