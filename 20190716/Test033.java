class A{
	private int mayak = 10;
	protected int monariza = 20;
	public int house2 = 30;
}

class B extends A{
	void print(){
//		System.out.println(mayak);
		System.out.println(monariza);
		System.out.println(house2);
	}
}


public class Test033{
	public static void main(String[] args){
	//자손에서도 접근할 수 없고, 참조형 변수에서도 접근할 수 없다.
		A look  = new A();
//		System.out.println(look.mayak);
		System.out.println(look.monariza);
		System.out.println(look.house2);
	//자바에서는 된다. C++에서는 안된다.
	}
}

/*
look.monariza 은 같은 패키지에서는 접근 가능, 다른 패키지에서는 접근 불가.

protected를 포수의 사인으로 이해하면 좋다.
같은 팀의 다른 클래스에게는 알려지지만, 다른팀에 소속된 클래스는 접근 불가해야 한다.
후배에게 물려줄때는 당연히 접근 가능해야 한다.
*/