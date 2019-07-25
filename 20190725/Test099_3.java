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
		
		/*
			ResultSet rs은 Cursor (select 결과) 에 접근 가능한 정보.
			Cursor는 서버에 생긴다.
			
			Connection이 닫힌 다음에서는 ResultSet은 사용 불가하다.
			( Connection 닫기 전에 사용 끝나야 한다.)
			
			Connection은 대단히 비싼 자원이고 굉장히 제한적이다.
			접속 후에 빨리 끊어주는게 바람직하다.  (콜센터를 연상하면 된다.)
		*/
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()){
//			System.out.println(rs.getArray("stid")[0]);
			String stid = rs.getString("stid");
			String name = rs.getString("name");
			String addr = rs.getString("addr");
			System.out.println(stid+"\t"+name+"\t"+addr);
		}
		rs.close();
	
		//Connection은 빨리 끊어줘야 한다.
		stmt.close();
		conn.close();
	}
}
