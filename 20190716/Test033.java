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
	//�ڼտ����� ������ �� ����, ������ ���������� ������ �� ����.
		A look  = new A();
//		System.out.println(look.mayak);
		System.out.println(look.monariza);
		System.out.println(look.house2);
	//�ڹٿ����� �ȴ�. C++������ �ȵȴ�.
	}
}

/*
look.monariza �� ���� ��Ű�������� ���� ����, �ٸ� ��Ű�������� ���� �Ұ�.

protected�� ������ �������� �����ϸ� ����.
���� ���� �ٸ� Ŭ�������Դ� �˷�������, �ٸ����� �Ҽӵ� Ŭ������ ���� �Ұ��ؾ� �Ѵ�.
�Ĺ迡�� �����ٶ��� �翬�� ���� �����ؾ� �Ѵ�.
*/