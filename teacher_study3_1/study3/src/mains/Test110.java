package mains;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Test110 {
	public static void main(String[] args) throws Exception {
		//	String data = "xyz";
		String data = null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");
		
		//	sql 이어붙일땐 '' 에 주의해야 한다.
		//	data 에 null 일때는 에러난다. 왜?? 
		//	나름 해결책이지만 null 가능 필드가 2개면 경우의수가 4개, 3개면 8개
		
		//	이런문제 때문에 현업에서는 PreparedStatement 를 더 선호한다.
		//	: 현업에서는 아예 char 는 무조건 4자리 이상을 잡게 하는 경우도 있다.
		String sql = ( data != null ) ?
			"insert into temp20t values ('"+ data +"')" :
			"insert into temp20t values (null)";
		
		Statement stmt = conn.createStatement();
		stmt.executeUpdate( sql );
		
		stmt.close();
		conn.close();
	}
}
/*	
 	insert into temp20t values ('abc');
 	insert into temp20t values ( null );
 	
 	Q. null 4글자가 입력 가능? null 은 빈 값을 의미한다.
 	insert into temp20t values ( 'null' ); - null 과 'null' 은 구분하자.
 	
 	% 	select * from temp20t where data = null;	NO
 		select * from temp20t where data is null;	YES
 		( null 과의 비교는 is 를 이용한다 )
 
	create table temp20t (
		data char(3) null
	);
*/







