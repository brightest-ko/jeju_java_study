class A{
	private int data = 100;
	public int getData(){return data;}
}

class B extends A{
	private int data = 200;
	public int getData(){return 
	data;}
	//super�� �ȵ� �ֳĸ� private�ϴϱ�
}


public class Test034{
	public static void main(String[] args){
		A t = new B();
//		System.out.print(t.data);
		System.out.print(t.getData());

	}
}

/* ��������� ������ private�ϰ� �����Ѵ�. */