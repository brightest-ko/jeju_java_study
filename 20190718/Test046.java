public class Test046{
	public static void main(String[] args) throws Exception{
		int[] i = new int[]{4,9,6,5};
		int max = i[0];
		
		for(int j=1;j<4;j++){
			if(max<i[j]) max = i[j];
		}
		
		System.out.println(max);
	}
}