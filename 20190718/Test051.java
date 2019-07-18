class Temp{
	private Object data = 100;
	public Object getData(){return data;}
	public void setData(Object data){this.data=data;}
}

public class Test051{
	public static void main(String[] args) throws Exception{
		Temp t = new Temp();
		t.setData("HelloWorld");
		
		String l = (String)t.getData();
		
		t.setData(100);
		System.out.println(t.getData());
		
	}
}