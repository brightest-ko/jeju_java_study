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

		//����Ÿ���� ������ �ڼ��� �ν��Ͻ��� ����ų �� �ִ�.
		A t = new B(); //������� �ν��Ͻ����� print2�� ����������
		t.print();
		//���󿡼� �����Ȱ��� ����������, �ڼտ��� �߰��� ���� �ȵ�
		//����������, ȣ���� �������� �ʴ�.
//		t.print2();
		System.out.println(t.i);
		
	}
}
