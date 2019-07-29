import java.sql.*;
import java.util.*;

/*
	conn을 통해서 excuteUpdate 하면 Log흫 거쳐서 table에 저장된다.
	jdbc는 AutoCommit을 지원한다.
	즉, executeUpdate()시에 무조건 commit이 자동으로 반연된다.
 
	conn.setAutoCommit(false); 를 사용하면 AutoCommit이 일어나지 않는다.
	
*/
public class Test106{
    public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");
		Statement stmt = conn.createStatement();
		
		conn.setAutoCommit(false);
		stmt.executeUpdate("insert into test_tx values (111)");
		stmt.executeUpdate("insert into test_tx values (112)");
		stmt.executeUpdate("insert into test_tx values (113)");
		stmt.executeUpdate("insert into test_tx values (114)");
		stmt.executeUpdate("insert into test_tx values (115)");
		
		stmt.close(); //로그를 테이블에 반영시키고 비운다.
		conn.rollback(); //로그를 그냥 비운다.
		conn.close();
	}
}

/*
	Create table test_tx(
		data int
	);
	insert into test_tx values (100);
*/