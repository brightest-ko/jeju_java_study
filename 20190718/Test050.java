class Temp{
	private Object data = 100;
	public Object getData(){return data;}
	public void setData(Object data){this.data=data;}
}

public class Test050{
	public static void main(String[] args) throws Exception{
		String l = "HelloWorld";
		String t = "HelloWorld";
		System.out.println(l==t);
		
		Object o = "HelloWorld";
		String r = (String)o;
	}
}