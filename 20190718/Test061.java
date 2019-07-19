class Temp{
	public static int indexOf3(char[] str, char[] parts){
		for(int i=0;i<str.length;i++){
			int a = 1;
			for(int j=0;j<parts.length;j++){
				if(i+j>=str.length){
					a = 0;
					break;
				}else{
					if(str[i+j] != parts[j]){
						a = 0;
						break;
					}
				}
			}
			if(a==1)	return i;
		}
		return -1;
	}
	public static int indexOf2(char[] str, char[] parts){
		int j = 0;
		for(int i=0;i<str.length;i++){
			if(str[i] == parts[j]){
				j++;
				if(j==parts.length) return i-parts.length+1;
			}else{
				j=0;
			}
		}
		return -1;
	}
	
	private static int find_idx = 0;
	public static int indexOf(char[] str1, char[] str2 ){
		int count = 0;
		for(int i=0; i<str2.length; i++){ // or
			for(int j=0; j<str1.length; j++){ // HelloWorld
				if(str1[j] == str2[i]) 
				{	
					find_idx = j;
					count ++;
					if(count==str2.length)
						return find_idx;
				}
			}
		}
		return -1;
	}
}

public class Test061{
	public static void main(String[] args) throws Exception{
		int idx = Temp.indexOf("HelloWorld".toCharArray(),"or".toCharArray()); //6
		System.out.println(idx);
		
		
		System.out.println(Temp.indexOf("HelloWorld".toCharArray(),"H".toCharArray())); //0
		System.out.println(Temp.indexOf("HelloWorld".toCharArray(),"l".toCharArray())); //2
		System.out.println(Temp.indexOf("HelloWorld".toCharArray(),"d1".toCharArray())); //-1
		System.out.println(Temp.indexOf("HelloWorld".toCharArray(),"HelloWorld2".toCharArray())); //-1
		System.out.println(Temp.indexOf("HelloWorld".toCharArray(),"ab".toCharArray())); //-1
		System.out.println(Temp.indexOf("HHlloWorld".toCharArray(),"Hl".toCharArray())); //1 2번째 만든게 안되는 이유!
		
		System.out.println();		
		String l = "HelloWorld";
		System.out.println(l.indexOf("or") ); //0
		System.out.println(l.indexOf("H") ); //2
		System.out.println(l.indexOf("l") ); //-1
		System.out.println(l.indexOf("d1") ); //-1
		System.out.println(l.indexOf("HelloWorld2") ); //-1
		System.out.println(l.indexOf("ab") ); //-1
		
		l = "HHelloWorld";
		System.out.println(l.indexOf("Hl") ); //-1
	}
}