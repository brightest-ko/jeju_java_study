abstract class A{
//��������� ���ǵ��� �ʾҴ�.
//abstract �޼ҵ带 �ϳ��� ���� Ŭ������ abstractŬ������� �����ؾ� �Ѵ�.
	abstract public void print();
}
class B extends A{
//abstract�޼ҵ带 �������̵��ϸ� abstract ������ �������� �ȴ�.
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

