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
		
		//	sql �̾���϶� '' �� �����ؾ� �Ѵ�.
		//	data �� null �϶��� ��������. ��?? 
		//	���� �ذ�å������ null ���� �ʵ尡 2���� ����Ǽ��� 4��, 3���� 8��
		
		//	�̷����� ������ ���������� PreparedStatement �� �� ��ȣ�Ѵ�.
		//	: ���������� �ƿ� char �� ������ 4�ڸ� �̻��� ��� �ϴ� ��쵵 �ִ�.
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
 	
 	Q. null 4���ڰ� �Է� ����? null �� �� ���� �ǹ��Ѵ�.
 	insert into temp20t values ( 'null' ); - null �� 'null' �� ��������.
 	
 	% 	select * from temp20t where data = null;	NO
 		select * from temp20t where data is null;	YES
 		( null ���� �񱳴� is �� �̿��Ѵ� )
 
	create table temp20t (
		data char(3) null
	);
*/







