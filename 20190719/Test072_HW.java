import java.util.*;

class HW{
	static int[] rnadomArray(int x, int max_num){
	
		Set<Integer> hset = new HashSet<Integer>();
        while(hset.size() == x){
			Integer a = Integer.valueOf(Math.random()*max_num);
			hset.add(a);
		}
		
		
		Integer[] array = new Integer[hset.size()];
		hset.toArray(array);
		
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i].intValue();
		}
		return result;
		
	}
	
/*
	static int[] rnadomArray2(int x, int max_num){
		int[] ans = new int[100];
		int cnt = 0;
        while(cnt == x){
			int a = (int)(Math.random()*max_num);
			cnt++;
			for(int j=0;j<i;j++){
				if(ans[j] == a){
					cnt--;
					continue;
				}
			}
            ans[i] = (int)(Math.random()*100);
        }
		
		return ans[];
	}*/

}

/*	2가지 이상의 다른 방법으로 구현해 보세요.
	1가지 방법에는 Collection 금지.

	100 은 0 - 99 사이의 숫자를 생성해야 한다.
*/
public class Test072_HW 
{
    public static void main( String[] args ) {
		int[] rl = HW.randomArray( 6, 100 );
		for( int i = 0 ; i < rl.length ; i++ ) {
			System.out.println( rl[i] );
		}
    }
}
