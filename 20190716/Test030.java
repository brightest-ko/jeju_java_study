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
	��Ӱ��谡 ������ �� (���� ����Ŭ����, �ڼ�Ŭ����) �ڼ��� �ν��Ͻ��� �����ϸ�,
	������ �����ڰ� ���� ȣ��ǰ�, �ڼ��� �����ڰ� ȣ��ȴ�.
	
	�����ڴ� ��ӵ��� �ʽ��ϴ�. �ٸ� ȣ��� ���̴�.  �ֳ��ϸ� ����Լ��� �ƴϹǷ�.
	������ ������ ȣ���� �� ����.
	*/
