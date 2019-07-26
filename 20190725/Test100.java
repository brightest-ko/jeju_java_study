import java.sql.*;
import java.util.*;

/*
	클라우드에서 ojdbc14.jar 파일 다운 : 작업폴더에 복사
	mysql의 코드와 거의 틀린점이 없다.
	Connection, Statement 를 상속한 Oracle과 연동 가능한 클래스를
		OracleDriver 에서 DriverManager에 세팅해 주면
		Oracle에 맞추어 개발된 Connection, Statement, ResultSet 등을
		상복받은 클래스가 공급되는 구조이다.
*/
public class Test100{
	public static void main( String[] args ) throws Exception{
		//1.
		//Class.forName("com.mysql.jdbc.Driver"); //Driver가 load됨
		Class.forName("oracle.jdbc.driver.OracleDriver");		

		//2.
		//Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/study","root","1111");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");//XE 익스프레스 에디션 사용중
		System.out.println (conn.getClass().getName());
		
		//3.
		//Statement stmt = conn.createStatement();
		Statement stmt = conn.createStatement();
		
		String sql = "select sysdate from dual"; //mysql :now() oracle :sysdate() 현재시간
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()){
			//필드명 대신에 숫자 가능. 1은 나열된 첫번째 필드를 의미
			String l = rs.getString(1);
			System.out.println(1);
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
		
	}
}
