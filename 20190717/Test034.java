class A{
	private int data = 100;
	public int getData(){return data;}
}

class B extends A{
	private int data = 200;
	public int getData(){return 
	data;}
	//super는 안됨 왜냐면 private하니까
}


public class Test034{
	public static void main(String[] args){
		A t = new B();
//		System.out.print(t.data);
		System.out.print(t.getData());

	}
}

/* 멤버변수는 무조건 private하게 선언한다. */