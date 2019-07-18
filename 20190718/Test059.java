public class Test059{
	public static void main(String[] args) throws Exception{
		//String l="";
		//for(int i=0;i<1000000;i++){
		//	l = l+"apple";
		//}
		
		StringBuffer l = new StringBuffer();
		for(int i=0;i<1000000;i++){
			l.append("apple");
		}
		System.out.println(l.toString());
	}
}