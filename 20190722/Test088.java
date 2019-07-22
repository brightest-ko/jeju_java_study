package temp;
import java.io.*;

public class Test088{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = null;
		while(!"quit".equals(l)){
			l = br.readLine();
			System.out.println("> "+l);
		}
		br.close();
	}
}
//¼„ ”î