import java.util.*;

class HW{
	static String CollectionString(List<String> l){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		Iterator<String> it = l.iterator();
		while(it.hasNext()){
			String ll = it.next();
			sb.append("'");
			sb.append(ll);
			sb.append("'");
			
			if(it.hasNext()){
				sb.append(",");
			}
		}
		
		sb.append("]");
		return sb.toString();
	}
}

public class Test073_HW{
	public static void main(String[] args){
	
		List<String> ls = new ArrayList<String>();
		ls.add("apple");
		ls.add("banana");
		ls.add("orange");
		ls.add("kiwi");
		
		String l = HW.CollectionString(ls);
		System.out.println( l );
	}
}