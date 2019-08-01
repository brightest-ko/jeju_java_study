package study3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*	많은 사람들이 동시에 접속해도 동일한 문자열이 계속 찍힌다.
 * 	- 동일한 인스턴스가 계속 재사용되고 있다. : 메모리 관리에는 장점이다.
 *  - 한꺼번에 많이 들어와도 적게 메모리를 소모한다.
 * 
 */
public class LifeServlet extends HttpServlet {

	int i = 0;
	
	@Override
	public void service(HttpServletRequest requset , 
		HttpServletResponse response ) 
		throws ServletException, IOException 
	{
		System.out.println( this.toString() );
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		//	왜 synchronized 가 필요할까?... 
		//	동시요청시 여러개의 쓰레드가 하나의 서블릿 인스턴스를 사용할 수 있다.
		//	모두 로컬변수로만 구현하든지 동기화를 잘 해 주어야 한다.
		synchronized( this ) {
			i = i + 1;
			for( int j = 0 ; j < 500000 ; j++ ){
				out.println( i );
			}
		}
		
		out.println("</body></html>");
		out.flush();
		out.close();
	}
}










