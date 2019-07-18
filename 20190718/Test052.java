class Temp <T extends Object>{
	private T data = null;
	public T getData(){return data;}
	public void setData(T data){this.data=data;}
}

//1.5버전부터 지원됨
public class Test052{
	public static void main(String[] args) throws Exception{
		Temp<String> t = new Temp<String>();
		t.setData("Hello");
		String l = t.getData();
		System.out.println(l);
	}
}