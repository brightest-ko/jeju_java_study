package study3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//	/session 으로 접근 가능하게 만드세요 

//	http://localhost:8081/study3/state?use=readCookie : JSESSIONID 값이 보인다.

public class SessionServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException 
	{
		//	처음만 true , 그 이후에는 false
		HttpSession session = request.getSession();
		System.out.println( session.isNew() );
		
		session.setAttribute("apple","Object!!!");
		Object value = session.getAttribute("apple");
		System.out.println( value.toString() );
	}
}
/*
	최초 getSession() 호출시에는 고유넘버가 없이 요청이 들어온다.
	- 기억장소 생성 Map<String,Object> 형태
	- 고유넘버 생성
	- JSESSIONID 키 값으로 고유넘버를 쿠키에 저장
	
	그 이후에 getSession() 호출 : 고유넘버 물고 왔으니 그걸로 기억장소 찾는다.
	
	"브라우저마다 개별적인 기억장소가 생성된다"
	
	쿠키와 세션은 많이 비슷하다 - 브라우저마다 개별적인 기억공간
	1. 쿠키는 브라우저에 , 세션은 서버에 
	2. 쿠키는 파일 , 세션은 Map<String,Object> 에 저장
	3. 쿠키는 조작이 가능할 수도 있지만 세션은 어려워... 
	
	초반엔 세션 , 요즘엔 쿠키를 많이 쓰는 경향이 있다.....
*/










