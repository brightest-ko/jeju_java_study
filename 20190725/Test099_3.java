import java.sql.*;
public class Test099_3{
	static{
		/*
			connection, statement ��� �������̽���.
			DriverManager, getConnection �ȿ��� Connection�� ��ӹ��� ������ Ŭ������ �ν��Ͻ��� �����Ѵ�.
			�װ��� Mysql�� ������ �� �ִ� ����� �����ϰ� �ִ�.
			->�� ������ Ŭ���� �����ϴ� �ڵ尡 		Class.forName("com.mysql.jdbc.Driver");

		*/
	}
	public static void main( String[] args ) throws Exception{
		Class.forName("com.mysql.jdbc.Driver"); //Driver�� load��
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