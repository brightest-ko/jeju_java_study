import java.sql.*;
import java.util.*;

/*
	conn�� ���ؼ� excuteUpdate �ϸ� Logň ���ļ� table�� ����ȴ�.
	jdbc�� AutoCommit�� �����Ѵ�.
	��, executeUpdate()�ÿ� ������ commit�� �ڵ����� �ݿ��ȴ�.
 
	conn.setAutoCommit(false); �� ����ϸ� AutoCommit�� �Ͼ�� �ʴ´�.
	
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
		
		stmt.close(); //�α׸� ���̺� �ݿ���Ű�� ����.
		conn.rollback(); //�α׸� �׳� ����.
		conn.close();
	}
}

/*
	Create table test_tx(
		data int
	);
	insert into test_tx values (100);
*/