package study3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class JSPServlet extends HttpServlet 
{
	private ServletContext application = null;
	private ServletConfig config = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		application = config.getServletContext();
	}

	// ---------------------------------------------------------------
	//	<%! ... %> �� ���⿡ �´�.
	int i = 0;
	// ---------------------------------------------------------------	
	
	@Override
	public void service(HttpServletRequest request, 
		HttpServletResponse response ) 
		throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		// ---------------------------------------------------------------
		//	<% ... %> �� ���⿡ �´�.
		//	<%= ... %> �� out.println( ... ); ���� �����ش�.
		
		int j = 0;
		out.println(i++);
		out.println(j++);
		
		//	Test115.jsp ������ �̰Ͱ� ������ ���·� ��ȯ�ǰ� �����ϵǰ� 
		//		�ν��Ͻ� ��������� ����� �ڿ� ����ȴ�. 
		// ---------------------------------------------------------------			
		
		out.flush();
		out.close();
	}
}






