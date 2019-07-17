public class Test003{

    public static void main(String args[]) {
		//10년 1년에 한번씩 찍음
		double a=100;
		for(int i=0;i<10;i++){
		a*=1.066;
		System.out.println(a);
		}
		
		//100만원을 100년간 6.6% 이자로 복리운영한다. 그 결과를 위의 for반복문을 이용하여 만들고
		a=100;
		for(int i=0;i<100;i++){
			a=a*1.066;
		}
		System.out.println(a);
		
		//100만원을 100년간 불입하고 6.6%이자로 운영하면?
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
 
	