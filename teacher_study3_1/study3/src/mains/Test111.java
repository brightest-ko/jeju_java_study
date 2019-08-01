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
		
		/*	Statement 가 어떤 SQL 문장이든 실행하는 범용적인데 반해서
		 * 	PreparedStatement 는 생성시에 준비한 그 문장만 실행 할 수 있다.
		 * 	대신 ? 영역을 setString , setInteger 등을 이용하여 채울 수 있다.
		 * 	( 순서가 1 부터 시작하는 것에 주의 )
		 * 	
		 * 	execute 시에 매개변수 없음에 주의.
		 * 	이걸 쓰면 null 값을 넣을 때 '' 를 붙여야 할지를 결정하기 위해
		 * 		이런 저런 고민할 필요가 없어진다 ( Test110 참고 )
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







