public class Test063{
	public static void main(String[] args){
		boolean i = true;
		boolean j = false;
		 
		System.out.println(10 < 5);
		System.out.println(10 / 3); //몫 (int / int = int)
		System.out.println(10 % 3); //나머지 
		
		//double값은 정확하다고 할 수 없기 때문에 == 비교는 해서는 안된다. 
		System.out.println(10.0 / 3);
		System.out.println( 3.3333 * 3 == 10);
		
		//비교연산은 boolean 값을 리턴: == != < > <= >=
		//거의 모든 연산은 같은 자료형 끼리 가능.
	}
}