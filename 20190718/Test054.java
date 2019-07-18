
public class Test054{
	public static void main(String[] args) throws Exception{
		Object ob = new Integer(100);
		Object ob2 = new Double(10.2);
		
		int i = ((Integer)ob).intValue();
		System.out.println(i);
		double d = ((Double)ob2).doubleValue();
		System.out.println(d);
	}
}