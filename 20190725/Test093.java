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
		
		/*new thread() �ϸ� ������ cpu�� os���� �Ҵ�޴´�. (�н�)
		�Ҵ���� cpu�� �����ڿ� �Ѱ��� �����͸� ������.
		start() ȣ��ÿ� �غ������ ���� ���ο� ���� cpu�� br.
		*/
	}
}


//�����ϱ�