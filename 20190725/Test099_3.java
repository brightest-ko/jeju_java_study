import java.sql.*;
public class Test099_3{
	static{
		/*
			connection, statement 모두 인터페이스다.
			DriverManager, getConnection 안에서 Connection을 상속받은 모종의 클래스의 인스턴스를 리턴한다.
			그건은 Mysql에 접속할 수 있는 기능을 구현하고 있다.
			->그 모종의 클랫를 세팅하는 코드가 		Class.forName("com.mysql.jdbc.Driver");

		*/
	}
	public static void main( String[] args ) throws Exception{
		Class.forName("com.mysql.jdbc.Driver"); //Driver가 load됨
		Connection conn = DriverManager.getConnection(
			"jdbc:mysql://127.0.0.1:3306/study","root","1111");
		System.out.println(conn.getClass().getName());
		Statement stmt = conn.createStatement();
		
		String sql = "select * from studentt";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			String stid = rs.getString("stid");
			System.out.println(stid);
		}
		rs.close();
	
		stmt.close();
		conn.close();
	}
}