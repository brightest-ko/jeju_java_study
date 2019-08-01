package mains;

interface ITemp {
	public void print();	
}

public class Test114 {
	public static void main(String[] args) {
		/*	Anonymous class : �̸� ���� Ŭ���� ( ������ �ִ� : ITemp )
		 * 		"ITemp �� ��ӹް� - �׷��� ��� �޼ҵ� �������̵� �� �ְ� ..."
		 * 
		 * 	�̸��� ��� ������ �Ұ����ϴ�.
		 * 	- Ŭ���� �����ϰ� , �ν��Ͻ� �����ϰ�� �� ....
		 * 
		 * 	t �� �� ����ų �� �ִ� ����??
		 * 	( A t = new B() );
		 * 
		 * 	final �� ����� ���ú����� anonymous class �ȿ��� ��� �����ϴ�.
		 * 	- ���� �����Ϸ��� ���� ���� �ܿ���. ��ü���� ���� �� ������ ...
		 */
		final int i = 100;
		
		ITemp t = new ITemp(){
			public void print(){
				System.out.println( "HelloWorld " + i );
			}
		};
		t.print();

	}
}








