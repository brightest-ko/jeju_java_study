class A{

}
class B extends A{
	public void print(){System.out.println(100);}
}

public class Test062{
	public static void main(String[] args){
		A t = new A();
		//������ ���� instanceof Ŭ������
		//(B)t�̰��� �����ϸ� true / �ƴϸ� false
		if(t instanceof B){
			//t�� ����Ű�� �ν��Ͻ��� ���δ� B�ν��Ͻ� ������ �����ؾ߸� ����
			B t2 = (B)t;
			t2.print();
		}
	}
}