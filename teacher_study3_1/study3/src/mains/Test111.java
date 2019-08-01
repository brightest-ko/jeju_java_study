package mains;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class Test111 {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");
		
		/*	Statement �� � SQL �����̵� �����ϴ� �������ε� ���ؼ�
		 * 	PreparedStatement �� �����ÿ� �غ��� �� ���常 ���� �� �� �ִ�.
		 * 	��� ? ������ setString , setInteger ���� �̿��Ͽ� ä�� �� �ִ�.
		 * 	( ������ 1 ���� �����ϴ� �Ϳ� ���� )
		 * 	
		 * 	execute �ÿ� �Ű����� ������ ����.
		 * 	�̰� ���� null ���� ���� �� '' �� �ٿ��� ������ �����ϱ� ����
		 * 		�̷� ���� ����� �ʿ䰡 �������� ( Test110 ���� )
		 */
		String sql = "insert into temp20t values ( ? )";
		PreparedStatement stmt = conn.prepareStatement( sql );
		stmt.setString( 1, null );
		stmt.executeUpdate();

		stmt.close();
		conn.close();
	}
}
/*	
	create table temp20t (
		data char(3) null
	);
*/







