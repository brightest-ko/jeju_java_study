class Temp{
	int i=100;
	static void print(){System.out.println(i);} // static�� ��� �Լ� �ȿ��� non-static�� ����Լ�, ������ ������ �� ����. �ν��Ͻ� ������ ���� �ʾ� ����� �� ����.
}


public class Test043{
	public static void main(String[] arg){
		Temp.print();
	}
}