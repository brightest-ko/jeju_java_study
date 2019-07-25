
class A implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("A running");
		}
	}
}
class B implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("B running");
		}
	}
}
class C implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("C running");
		}
	}
}
public class Test098{
	public static void main_old( String[] args ){
		new Thread(new A()).start();
		new Thread(new B()).start();
		new Thread(new C()).start();
		
		System.out.println("��������");
		
	}
	public static void main( String[] args ){
		Thread[] threads = new Thread[3];
		threads[0] = new Thread(new A());
		threads[1] = new Thread(new B());
		threads[2] = new Thread(new C());
		threads[0].start();
		threads[1].start();
		threads[2].start();
		try{
			//0���� �����尡 ������ ������ �� �Ʒ��� �� ��������.
			threads[0].join();
//			threads[1].join();
//			threads[2].join();
		}catch(InterruptedException e){}
		System.out.println("��������");
		
	}
}