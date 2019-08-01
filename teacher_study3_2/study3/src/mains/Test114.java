package mains;

interface ITemp {
	public void print();	
}

public class Test114 {
	public static void main(String[] args) {
		/*	Anonymous class : 이름 없는 클래스 ( 조상은 있다 : ITemp )
		 * 		"ITemp 를 상속받고 - 그러면 모든 메소드 오버라이딩 해 주고 ..."
		 * 
		 * 	이름이 없어서 재사용은 불가능하다.
		 * 	- 클래스 선언하고 , 인스턴스 생성하고는 끝 ....
		 * 
		 * 	t 가 왜 가리킬 수 있는 거지??
		 * 	( A t = new B() );
		 * 
		 * 	final 로 선언된 로컬변수는 anonymous class 안에서 사용 가능하다.
		 * 	- 절대 이해하려고 하지 말고 외워라. 객체지향 개념 다 버린다 ...
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








