import java.util.*;


public class Test068{
	public static void main(String[] args) throws Exception{
		List<String> l = new LinkedList<String>();
		l.add("apple");
		l.add("banana");
		l.add("orange");
		l.add("kiwi");
		
		//���� for ����
		for(String t : l){
			System.out.println(t);
		}
	}
}