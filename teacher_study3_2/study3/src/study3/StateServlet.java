package study3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
	/study3/state �� ���� �����ϰ� �����ϼ���.

	http://localhost:8081/study3/state?use=readCookie
	��û -> ���� , ��û�� ����� �ΰ��� GET/POST �ִ�. GET�� ���� , POST �� �ù�
	
	������ �ּҿ� ������ �����ϴ� ���� ���� : ? �̴�.
		? �������� ������ key=value ���·� �����ǰ� 
		request.getParameter �� �̿��Ͽ� ������ �� �ִ�.
		
	���� ��κ� GET ����̰�, form ���� method="POST" �� ������ ��츸 POST ���
*/
public class StateServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException 
	{
		String use = request.getParameter("use");
		System.out.println( use );
		
		if( "addCookie".equals( use ) ) {
			Cookie ck = new Cookie("name","apple");
			response.addCookie( ck );
		}
		else if( "readCookie".equals( use ) ) {
			Cookie[] cks = request.getCookies();
			if( cks != null ) {
				for( int i = 0 ; i < cks.length ; i++ ) {
					String l = cks[i].getName() + "," + cks[i].getValue();
					System.out.println( l );
				}
			}
			else {
				System.out.println( "Cookie is null" );
			}
		}
	}
}



