import java.util.*;


public class Test069{
	public static void main(String[] args) throws Exception{
		//Set<String> l = new TreeSet<String>();
		Set<String> l = new HashSet<String>();
		l.add("apple");
		l.add("banana");
		l.add("banana");
		l.add("orange");
		l.add("kiwi");
		
		
		//향상된 for 문장
		for(String t : l){
			System.out.println(t);
		}
		
		Iterator<String> it = l.iterator();
		while(it.hasNext()){
			String ll = it.next();
			System.out.println(ll);
			if(ll.indexOf("an")!= -1){
				it.remove();
			}
		}
		System.out.println(l);
	}
}