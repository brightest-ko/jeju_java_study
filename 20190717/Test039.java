interface IGreet{
	public String greet();
}

class MerciGreet implements IGreet{
	public String greet(){return "Merci";}
}
class HelloGreet implements IGreet{
	public String greet(){return "Hello";}
}

abstract class GreetDeco implements IGreet{
	protected IGreet ig = null;
	GreetDeco(IGreet i){
		ig = i;
	}
}

class SharpDeco extends GreetDeco{
	SharpDeco(IGreet i){
		super(i);
	}
	public String greet(){return "#"+ig.greet()+"#";}
}

class StarDeco extends GreetDeco{
	StarDeco(IGreet i){
		super(i);
	}
	public String greet(){return "*"+ig.greet()+"*";}
}
public class Test039{
	public static void main(String[] args){
		IGreet ic = new SharpDeco( new StarDeco( new MerciGreet() ) );
		System.out.println(ic.greet());
		IGreet ic2 = new HelloGreet();
		System.out.println(ic2.greet());
		
	}
}