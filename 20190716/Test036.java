abstract class Bank{
	abstract public double calc(double money, int years, double rate);
	public void print(){
		double r = calc(100.0, 100, 0.066);
		System.out.println(r);
	}
}

class BokriBank extends Bank{
	public double calc(double money, int years, double rate){
		return 59665.1234;
	}
}
class DanriBank extends Bank{
	public double calc(double money, int years, double rate){
		return 770;
	}
}

public class Test036{
	public static void main(String[] args){
		Bank vk = new BokriBank();
		vk.print();
		Bank vk2 = new DanriBank();
		vk2.print();
	}
}