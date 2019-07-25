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
		
		/*
			ResultSet rs�� Cursor (select ���) �� ���� ������ ����.
			Cursor�� ������ �����.
			
			Connection�� ���� ���������� ResultSet�� ��� �Ұ��ϴ�.
			( Connection �ݱ� ���� ��� ������ �Ѵ�.)
			
			Connection�� ����� ��� �ڿ��̰� ������ �������̴�.
			���� �Ŀ� ���� �����ִ°� �ٶ����ϴ�.  (�ݼ��͸� �����ϸ� �ȴ�.)
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
	
		//Connection�� ���� ������� �Ѵ�.
		stmt.close();
		conn.close();
	}
}
