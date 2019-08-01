package mains;

public class Test112 
{
	//	매개변수로 String 을 0..* 개를 넣어도 에러가 안나는 선언 방식
	//		실은 String... 은 String[] 과 동일하다.
	
	public static void test( String... args ) {
		System.out.println( args.length );
	}

	public static void test2( Object... args ) {
		for( int i = 0 ; i < args.length ; i++ ) {
			if( args[i] == null ) {
				System.out.println( "null" );
			}
			else if( args[i] instanceof Integer ) {
				int r = ( (Integer)args[i] ).intValue();
				System.out.println( r + 1 );
			}			
			else if( args[i] instanceof Double ) {
				double r = ( (Double)args[i] ).doubleValue();
				System.out.println( r + 0.1 );
			}	
			else if( args[i] instanceof String ) {
				System.out.println( (String)args[i] );
			}			
		}
	}

	//	Object arg_1 = 100; -> 100 을 new Integer(100) 로 자동변환
	//	Object arg_3 = 3.14; -> 3.14 를 new Double(3.14) 로 자동변환
	//	Object arg_4 = null;
	
	public static void main(String[] args) {
		test2( 100, "Hello" , 3.14, null );
		
		test( "apple" );
		test();
		test( "apple",	"banana" );
	}
}
/*	autoboxing & unboxing 
 * 
	Object i = 100;	(O)
	int j = i; (X)
	
	Integer i = 100; (O)
	int j = i; (O)
*/














