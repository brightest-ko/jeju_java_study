public class Test003{

    public static void main(String args[]) {
		//10�� 1�⿡ �ѹ��� ����
		double a=100;
		for(int i=0;i<10;i++){
		a*=1.066;
		System.out.println(a);
		}
		
		//100������ 100�Ⱓ 6.6% ���ڷ� ������Ѵ�. �� ����� ���� for�ݺ����� �̿��Ͽ� �����
		a=100;
		for(int i=0;i<100;i++){
			a=a*1.066;
		}
		System.out.println(a);
		
		//100������ 100�Ⱓ �����ϰ� 6.6%���ڷ� ��ϸ�?
		a=100;
		for(int i=0;i<100;i++){
			a=a*1.066;
			a=a+100;
		}
		System.out.println(a);
		
		double c = 100*1.066;
		double b = 0;
		for(int i=1;i<=100;i++){
			double mul = 1;
			for(int j=1;j<i;j++){
				mul*=1.066;
			}
			b+=mul;
		}
		System.out.println(c*b);
   }
}
 
	