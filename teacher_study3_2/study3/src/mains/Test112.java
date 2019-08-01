package mains;

public class Test112 
{
	//	�Ű������� String �� 0..* ���� �־ ������ �ȳ��� ���� ���
	//		���� String... �� String[] �� �����ϴ�.
	
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

	//	Object arg_1 = 100; -> 100 �� new Integer(100) �� �ڵ���ȯ
	//	Object arg_3 = 3.14; -> 3.14 �� new Double(3.14) �� �ڵ���ȯ
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














