class A{
	int i=100;
}

class B extends A{
	int i=200;
	void print(){
		System.out.println("B");
	}
}

public class Test041{
	public static void main(String[] arg){
		A t = new B();
		System.out.println(t.i);
		//t.print(); //�Ұ���
		
		// t �����Ͱ� ����Ű�� �ν��Ͻ��� ���δ� BŬ���� �ν��Ͻ��� t2 �� ����Ų��.
		B t2 = (B)t;
		System.out.println(t2.i);
		t2.print();
	}
}