/*
	Program : executable file
	Process : a running program
	Thread :  a light-weighted process (독자 행동을 하지만 조금 다르다.
	
	:쓰레드는 프로세스 안에서만 존재가 가능하다.
	:쓰레드간 메모리를 공유할 수 있다.
	프로세스간은 메모리 전달은 가능해도 공유는 불가능 한다.
	'프로세스간의 메모리 전달의 대표적 수단이 소켓이다'
	(복사 & 붙이기 도 전달로 볼 수 있지만, 이건 윈도우에서 국한된 개념)
	
	:프로세스 종료 == 프로세스가 가진 모든 쓰레드의 종료
	(인간을 생각하면 이해 쉬움 : 뇌 위장 척추 ..)
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
			//쓰레드를 잠시 멈춰세우는 메소드 -밀리세컨드 단위
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
			//쓰레드를 잠시 멈춰세우는 메소드 -밀리세컨드 단위
			int time =(int)(Math.random() * 1000.0);
			if(time %2==0){
				toilet.bigWork("Banana");
			}else{
				toilet.sleepWork("Banana");
			}
				
			try{
				//쓰레드를 잠시 멈춰세우는 메소드 -밀리세컨드 단위
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
//하나밖에 없는 화장실에서 대 참사가 일어나는 줄...

쓰레드는 독자적으로 돌아가는 프로그램이기에 이런 일은 얼마든지 가능하다.
화장실 문에 잠금을 해 줘야 한다.
쓰레드 프로그램에서는 잠금이 중요한데 그것을 돌기화 ( Synchronization )이라고 한다.
//묶여서 나가는것!
synchronized(this){...}
모든 인스턴스에는 lock이라는 개념의 자물쇠? 열쇠? 가 있다.
this 가 가리키는 인스턴스가 가지고 있는 록을 획득해야 {에 진입 가능.
획득하지 못하면 쓰레드는 멈추어 기다려야 한다.
일을 마쳤으면 } 시점에서 lock을 반납한다.

*/