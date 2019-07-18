interface ICalc{
	public int execute(int i);
}
class AddCalc implements ICalc{
	private int data = 0;
	AddCalc(int j){
		data = j;
	}
	public int execute(int i){
		return (i+data);
	}
}
public class Test057{
	public static void main(String[] args) throws Exception{
		ICalc i = new AddCalc(3);
		int r = 5;
		r = i.execute(r);
		System.out.println(r);
	}
}