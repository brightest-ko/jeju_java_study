class Temp{
	private int data = 100;
	int getData(){return data;}
	void setData(int data){this.data=data;}
}

public class Test049{
	public static void main(String[] args) throws Exception{
		Temp t = new Temp();
		t.setData(200);
		System.out.println(t.getData());
	}
}