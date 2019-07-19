import java.util.*;

class HW{
	static int[] rnadomArray(){
		
		Set<String> l = new HashSet<String>();
		l.add("apple");
		l.add("banana");
		l.add("banana");
		l.add("orange");
		l.add("kiwi");
	}
}

public class Test069{
	public static void main(String[] args){
		int[] rl = HW.rnadomArray(6);
		for(int i=0;i<rl.length;i++){
			System.out.println(rl[i]);
		}
	}
}