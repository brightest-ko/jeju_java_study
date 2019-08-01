package study3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
	/study3/state 로 접근 가능하게 세팅하세요.

	http://localhost:8081/study3/state?use=readCookie
	요청 -> 응답 , 요청의 방법이 두가지 GET/POST 있다. GET은 엽서 , POST 는 택배
	
	엽서의 주소와 내용을 구분하는 선의 역할 : ? 이다.
		? 오른쪽의 내용은 key=value 형태로 구성되고 
		request.getParameter 를 이용하여 추출할 수 있다.
		
	거의 대부분 GET 방식이고, form 에서 method="POST" 로 지정된 경우만 POST 방식
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



