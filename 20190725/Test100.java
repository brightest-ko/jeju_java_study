import java.sql.*;
import java.util.*;

/*
	Ŭ���忡�� ojdbc14.jar ���� �ٿ� : �۾������� ����
	mysql�� �ڵ�� ���� Ʋ������ ����.
	Connection, Statement �� ����� Oracle�� ���� ������ Ŭ������
		OracleDriver ���� DriverManager�� ������ �ָ�
		Oracle�� ���߾� ���ߵ� Connection, Statement, ResultSet ����
		�󺹹��� Ŭ������ ���޵Ǵ� �����̴�.
*/
public class Test100{
	public static void main( String[] args ) throws Exception{
		//1.
		//Class.forName("com.mysql.jdbc.Driver"); //Driver�� load��
		Class.forName("oracle.jdbc.driver.OracleDriver");		

		//2.
		//Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/study","root","1111");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");//XE �ͽ������� ����� �����
		System.out.println (conn.getClass().getName());
		
		//3.
		//Statement stmt = conn.createStatement();
		Statement stmt = conn.createStatement();
		
		String sql = "select sysdate from dual"; //mysql :now() oracle :sysdate() ����ð�
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()){
			//�ʵ�� ��ſ� ���� ����. 1�� ������ ù��° �ʵ带 �ǹ�
			String l = rs.getString(1);
			System.out.println(1);
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
		
	}
}
