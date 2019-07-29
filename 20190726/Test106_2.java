import java.sql.*;
import java.util.*;

public class Test106_2{
    public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = null;
		Statement stmt = null;
	try{
		conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");
		stmt = conn.createStatement();
		
		conn.setAutoCommit(false);
		stmt.executeUpdate("insert into test_tx values (111)");
		stmt.executeUpdate("insert into test_tx values (112)");
		stmt.executeUpdate("insert into test_tx values (113)");
		stmt.executeUpdate("insert into test_tx values (114)");
		stmt.executeUpdate("insert into test_tx values (115)");
		
		conn.commit();
	}catch(Exception e){
		if(conn!=null) conn.rollback(); //로그를 그냥 비운다.
		
	}finally
		if(stmt!=null) stmt.close(); //로그를 테이블에 반영시키고 비운다.
		if(conn!=null) conn.close();
	}
}

/*
	Create table test_tx(
		data int
	);
	insert into test_tx values (100);
*/