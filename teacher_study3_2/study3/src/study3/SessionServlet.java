package study3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//	/session ���� ���� �����ϰ� ���弼�� 

//	http://localhost:8081/study3/state?use=readCookie : JSESSIONID ���� ���δ�.

public class SessionServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException 
	{
		//	ó���� true , �� ���Ŀ��� false
		HttpSession session = request.getSession();
		System.out.println( session.isNew() );
		
		session.setAttribute("apple","Object!!!");
		Object value = session.getAttribute("apple");
		System.out.println( value.toString() );
	}
}
/*
	���� getSession() ȣ��ÿ��� �����ѹ��� ���� ��û�� ���´�.
	- ������ ���� Map<String,Object> ����
	- �����ѹ� ����
	- JSESSIONID Ű ������ �����ѹ��� ��Ű�� ����
	
	�� ���Ŀ� getSession() ȣ�� : �����ѹ� ���� ������ �װɷ� ������ ã�´�.
	
	"���������� �������� �����Ұ� �����ȴ�"
	
	��Ű�� ������ ���� ����ϴ� - ���������� �������� ������
	1. ��Ű�� �������� , ������ ������ 
	2. ��Ű�� ���� , ������ Map<String,Object> �� ����
	3. ��Ű�� ������ ������ ���� ������ ������ �����... 
	
	�ʹݿ� ���� , ���� ��Ű�� ���� ���� ������ �ִ�.....
*/










