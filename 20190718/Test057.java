interface ICalc{
	public int execute(int i);
}
class AddCalc implements ICalc{
	private int data = 0;
	AddCalc(int j){
		data = j;
	}
	public int execute(int i){
		return (data+i);
	}
}
/*
	���⸦ �� ���� **�� �ٿ��� ����Ʈ �϶�� ��Ű�� �ʹ�.
	���� ���α׷��ӵ��� �� �������̽��� �̷� �� �̿��ߴ�.
*/
interface PrintStars{};
class MinusCalc implements ICalc, PrintStars{
	private int data = 0;
	MinusCalc(int j){
		data = j;
	}
	public int execute(int i){
		return (i-data);
	}
}
public class Test057{
	public static void main(String[] args) throws Exception{
		ICalc[] ls = new ICalc[5];
		ls[0] = new AddCalc(2);
		ls[1] = new MinusCalc(6);
		ls[2] = new AddCalc(3);
		ls[3] = new AddCalc(7);
		ls[4] = new MinusCalc(5);
		
		int y = 10;
		for(int i=0;i<ls.length;i++){
			y = ls[i].execute(y);
			System.out.println(y);
			
			if(ls[i] instanceof PrintStars){
				System.out.println("**");
			}
		}
	}
}