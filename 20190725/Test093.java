class CustomThreaded implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("HelloWorld "+i);
		}
	}
}

public class Test093{
	public static void main(String[] args){
		Runnable rb = new CustomThreaded();
		rb.run();
		
		/*new thread() 하면 가상의 cpu를 os에서 할당받는다. (분신)
		할당받은 cpu는 생성자에 넘겨진 포인터를 물고간다.
		start() 호출시에 준비과정을 거쳐 새로운 가상 cpu가 br.
		*/
	}
}


//정리하기