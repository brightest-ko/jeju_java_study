import java.util.*;


public class Test068{
	public static void main(String[] args) throws Exception{
		List<String> l = new LinkedList<String>();
		l.add("apple");
		l.add("banana");
		l.add("orange");
		l.add("kiwi");
		
		//향상된 for 문장
		for(String t : l){
			System.out.println(t);
		}
	}
}