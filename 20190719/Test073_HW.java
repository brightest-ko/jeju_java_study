import java.util.*;

class HW{
	static String CollectionString(List<String> l){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		Iterator<String> it = l.iterator();
		while(it.hasNext()){
			String ll = it.next();
			System.out.println(ll);
			if(ll.indexOf("an")!= -1){
				it.remove();
			}
		}
		sb.append("]");
		return sb.toString();
	}
}

public class Test069{
	public static void main(String[] args){
	
		List<String> l = new ArrayList<String>();
		l.add("apple");
		l.add("banana");
		l.add("orange");
		l.add("kiwi");
		
		String l = HW.CollectionString(ls);
		System.out.println( l );
	}
}