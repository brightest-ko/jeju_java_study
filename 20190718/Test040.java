class Temp{
	public void print(){}
	public void print(int i){}
	public void print(double i){System.out.println("3");}
	public void print(int i, int j){}
}
public class Test040{
	public static void main(String[] arg){
		Temp t = new Temp();
		t.print();
		
		float i = 3.14F; //3.14=�Ǽ� �⺻ �ڷ��� double => float:32bit double:64bit =>ūŸ���� ����Ÿ������ �ٷ� ��ȯ �ȵ�.
		t.print(i);
	}
}