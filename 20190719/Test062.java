class A{

}
class B extends A{
	public void print(){System.out.println(100);}
}

public class Test062{
	public static void main(String[] args){
		A t = new A();
		//참조형 변수 instanceof 클래스명
		//(B)t이것이 가능하면 true / 아니면 false
		if(t instanceof B){
			//t가 가르키는 인스턴스를 감싸는 B인스턴스 영역이 존재해야만 가능
			B t2 = (B)t;
			t2.print();
		}
	}
}