package study3;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigServlet extends HttpServlet {
	
	/*	������ �ν��Ͻ��� ��Ȱ��ȴ�.
	 * 
	 * 	�ν��Ͻ��� ��Ȱ���� ���� ���������� ����Ǵµ�
	 * 	����Ǵ� ������ ȣ��Ǵ� �Լ��� init - ���� ��û�ÿ��� ȣ��ȴ�.
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
		
		//	web.xml �� ������ ������ �о���� �� �ִ� ����� �����Ѵ�.
		String val = config.getInitParameter("apple");
		System.out.println( val );
		
		//	WEB-INF ������ �����ΰ��� ���´�. 
		/*	�������� ���� ���ϴ� ������ ���ε� ������ ���⿡ ���� �����ϴ�.
		 * 	��� �ް� ( ������ ) �ٿ� ������ FileInputStream ���� �о� ��������.
		 * 	�� �� FileInputStream �� �����θ� �ʿ�� �Ѵ�.
		 *  �� ��쿡 getRealPath �� �����ϰ� ���δ�.
		 */
		ServletContext application = config.getServletContext();
		String path = application.getRealPath("/WEB-INF/");
		System.out.println( path );
	}

	@Override
	public void service(HttpServletRequest request, 
		HttpServletResponse response ) 
		throws ServletException, IOException 
	{
		System.out.println("service");
		
		//	���ؽ�Ʈ ���
		String l = request.getContextPath();
		System.out.println( "getContextPath " + l );
		
		//	IP �ּ� ���� ������ ��ü��� 
		String m = request.getRequestURI();
		System.out.println( "getRequestURI " + m );
		
		//	������ �������� IP �ּҰ�
		String n = request.getRemoteAddr();
		System.out.println( "getRemoteAddr " + n );
		
		/*	������ �������� �ü�� ������ ���� ���ڿ��� �������.
		 * 	�̰��� �̿��Ͽ� ����Ϸ� �����Ѱ��� ������ ������ ���� �� �� �ְ�
		 * 	����Ͽ� ȭ��� �Ŀ� ȭ���� �����Ͽ� ������ �� �� �ִ�.
		 * 
Mozilla/5.0 (iPhone; CPU iPhone OS 12_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1.1 Mobile/15E148 Safari/604.1
service 
		 */
		String o = request.getHeader("User-Agent");
		System.out.println( "getHeader " + o );
	}

}
/*
<servlet>
<servlet-name>abcd6</servlet-name>
<servlet-class>study3.ConfigServlet</servlet-class>
<init-param>
	<param-name>apple</param-name>
	<param-value>blabla</param-value>
</init-param>
</servlet>
*/