/*
	Program : executable file
	Process : a running program
	Thread :  a light-weighted process (���� �ൿ�� ������ ���� �ٸ���.
	
	:������� ���μ��� �ȿ����� ���簡 �����ϴ�.
	:�����尣 �޸𸮸� ������ �� �ִ�.
	���μ������� �޸� ������ �����ص� ������ �Ұ��� �Ѵ�.
	'���μ������� �޸� ������ ��ǥ�� ������ �����̴�'
	(���� & ���̱� �� ���޷� �� �� ������, �̰� �����쿡�� ���ѵ� ����)
	
	:���μ��� ���� == ���μ����� ���� ��� �������� ����
	(�ΰ��� �����ϸ� ���� ���� : �� ���� ô�� ..)
*/
import java.util.*;

class Toilet{
	public void bigWork(String by){
		synchronized(this){
			System.out.println("Step1."+ by);
			System.out.println("Step2."+ by);
			System.out.println("Step3."+ by);
			System.out.println("Step4."+ by);
			System.out.println("Step5."+ by);
		}
	}
	
	
	public synchronized void sleepWork(String by){
			System.out.println("Sleep Step1."+ by);
			System.out.println("Sleep Step2."+ by);
			System.out.println("Sleep Step3."+ by);
	}
}
class A implements Runnable{
	private Toilet toilet = null;
	public A(Toilet t){
		toilet = t;
	}
	//Override
	public void run(){
		for ( int i = 0; i<100; i++){
			//�����带 ��� ���缼��� �޼ҵ� -�и������� ����
			int time =(int)(Math.random() * 1000.0);
			if(time %2==0){
				toilet.bigWork("Apple");
			}else{
				toilet.sleepWork("Apple");
			}
				
			try{
				//int time = (int)(Math.random() * 1000.0);
				Thread.sleep(time);
			}catch( InterruptedException e){}
			
			
		}
	}
}

class B implements Runnable{
	private Toilet toilet = null;
	public B(Toilet t){
		toilet = t;
	}
	
	//Override
	public void run(){
		for ( int i = 0; i<100; i++){
			//�����带 ��� ���缼��� �޼ҵ� -�и������� ����
			int time =(int)(Math.random() * 1000.0);
			if(time %2==0){
				toilet.bigWork("Banana");
			}else{
				toilet.sleepWork("Banana");
			}
				
			try{
				//�����带 ��� ���缼��� �޼ҵ� -�и������� ����
				//int time = (int)(Math.random() * 1000.0);
				Thread.sleep(time);
			}catch( InterruptedException e){}
		}
	}
}

public class Test095{
	public static void main( String[] args ){
		Toilet t = new Toilet();
		new Thread( new A(t) ).start();
		new Thread( new B(t) ).start();
	}

}

/*
Stemp2.Apple
Stemp3.Apple
Stemp4.Apple
Stemp1.Banana
Stemp2.Banana
Stemp5.Apple
Stemp3.Banana
Stemp4.Banana
//�ϳ��ۿ� ���� ȭ��ǿ��� �� ���簡 �Ͼ�� ��...

������� ���������� ���ư��� ���α׷��̱⿡ �̷� ���� �󸶵��� �����ϴ�.
ȭ��� ���� ����� �� ��� �Ѵ�.
������ ���α׷������� ����� �߿��ѵ� �װ��� ����ȭ ( Synchronization )�̶�� �Ѵ�.
//������ �����°�!
synchronized(this){...}
��� �ν��Ͻ����� lock�̶�� ������ �ڹ���? ����? �� �ִ�.
this �� ����Ű�� �ν��Ͻ��� ������ �ִ� ���� ȹ���ؾ� {�� ���� ����.
ȹ������ ���ϸ� ������� ���߾� ��ٷ��� �Ѵ�.
���� �������� } �������� lock�� �ݳ��Ѵ�.

*/