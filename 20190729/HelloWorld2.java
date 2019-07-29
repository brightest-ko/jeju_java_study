package apple;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.sql.*;

public class HelloWorld2 extends HttpServlet{
	@Override
	public void service( HttpServletRequest request, HttpServletResponse response ) throws IOException, ServletException{
		System.out.println("HelloWorld2");
		
		String theTime = null;
		try{
			//소속된 Context의 WEB-INF/lib에 ojdbc.jar넣고
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");
			System.out.println(conn);
			
			Statement stmt = conn.createStatement();
			
			String sql = "Select sysdate from dual";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()){
				theTime = rs.getString(1);
			}
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(Exception e){
		//에러가 난 정보를 역추적해서 출력해 준다.
			e.printStackTrace();
		}
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Hello World 2 : ^^*");
		out.println(theTime);
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}

//javac -d C:\javaWork\jeju_java_study\20190729\studyHome\WEB-INF\classes -classpath servlet-api.jar HelloWorld2.java