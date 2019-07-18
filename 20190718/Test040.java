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
		
		float i = 3.14F; //3.14=실수 기본 자료형 double => float:32bit double:64bit =>큰타입을 작은타입으로 바로 전환 안됨.
		t.print(i);
	}
}