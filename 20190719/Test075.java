//������̶�� ������ Ŭ������ �����. 
class FuelException extends RuntimeException{}
//Excption �� ����ϴ� : �������� �ȵȴ�.

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