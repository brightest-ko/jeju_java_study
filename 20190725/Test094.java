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

class A implements Runnable{
	//Override
	public void run(){
		for ( int i = 0; i<100; i++){
			System.out.println("Apple");
			
			try{
				//�����带 ��� ���缼��� �޼ҵ� -�и������� ����
				int time =(int)(Math.random() * 1000.0);
				Thread.sleep(time);
			}catch( InterruptedException e){}
			
			
		}
	}
}

class B implements Runnable{
	//Override
	public void run(){
		for ( int i = 0; i<100; i++){
			System.out.println("Banana");
			
			try{
				//�����带 ��� ���缼��� �޼ҵ� -�и������� ����
				int time = (int)(Math.random() * 1000.0);
				Thread.sleep(time);
			}catch( InterruptedException e){}
		}
	}
}

public class Test094{
	public static void main( String[] args ){
		new Thread( new A() ).start();
		System.out.println("��???");
		new Thread( new B() ).start();
		System.out.println("��???2");
	}

}

/*
	������� ���������� ���ư��� ���α׷��� �ȴ�.
	:APPLE ���̿� BANANA ������ ��®�µ� ����� �׷��ߴ�.
	��� �ؼ��ұ�? ���������� ���ÿ� ���ư��� ������.
*/