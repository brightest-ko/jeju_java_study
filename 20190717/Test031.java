//����
class A{
	void print(){
		System.out.println("A print");
	}
}

//�ڼ�
class B extends A{
	//�Ȱ��� �Լ��� �ι� �����ϸ� �ȵȴ�. �׷��� ������ ���� �ʴ´�. ��?
	void print(){
		System.out.println("B print");
		super.print();
	}
}
public class Test031{
	public static void main(String[] args){
	
		B t = new B();
		//�ڼտ��� �������� ���� ���´�!
		t.print();
//		t.super.print();
		
		A t2 = new A();
		t2.print();
		
		
	}
}
