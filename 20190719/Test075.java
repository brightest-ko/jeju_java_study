//연료고갈이라는 에러를 클래스로 명시함. 
class FuelException extends RuntimeException{}
//Excption 이 깐깐하다 : 컴파일이 안된다.

public class Test074{
	
	public void carDrive(int fuel){
		if(fuel==0){
			throw new FuelExcption();
		}
		System.out.println("GOGO");
	}
	public static void main(String[] args){
	
	}
}