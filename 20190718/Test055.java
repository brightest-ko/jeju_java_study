
public class Test055{
	public static void main(String[] args) throws Exception{

		Integer i = 100; //는 컴파일러가 Integer i= new Integer(100);로 자동으로 바꿈
		System.out.println(i.getClass().getName());
		
	}
}