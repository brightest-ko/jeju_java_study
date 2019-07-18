class Temp{
	private Object data = 100;
	public Object getData(){return data;}
	public void setData(Object data){this.data=data;}
}
class Temp2{
	private String data = null;
	public String getData(){return data;}
	public void setData(String data){this.data=data;}
}

public class Test051{
	public static void main(String[] args) throws Exception{
	
		//String만 가능하지만, 끄집어낼때 Casting할때 필요없다.
		Temp2 t2 = new Temp2();
		t2.setData("HelloWorld");
		String l2 = t2.getData();
		System.out.println(l2);
		
		//모든 자료형 가능하지만, 끄집어낼땐 Casting이 필요하다.
		Temp t = new Temp();
		t.setData("HelloWorld");
		String l = (String)t.getData();
		System.out.println(l);
		
		t.setData(100);
		System.out.println(t.getData());
		
	}
}