
public class Test056{
	public static void main(String[] args) throws Exception{

		Integer i = 100; //�� �����Ϸ��� Integer i= new Integer(100);�� �ڵ����� �ٲ�
		Object t = 200;
		System.out.println(i.getClass().getName());
		System.out.println(t.getClass().getName());
		
		int j = i; //UnBoxing
		int t2 = (Integer)t;
		System.out.println(j);
		System.out.println(t2);
	}
}