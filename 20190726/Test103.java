import java.sql.*;

// �Լ��� ȣ�⸸ �ϸ� DB�� �����Ͱ� ������ �����ϱ� . 


public class Test103{
	/* executeUpdate ��Ȳ���� �������� conn.close()�� �Ǿ���Ѵ�. 
	finally ������ try �������� ������ ���� �ȳ��� ������ �����Ѵ�. 
	: stmt.close() conn.close() �� finally�� �ű�. 
	: ���� ���� ���� ( try- catch- finally) 

	public static void addGul( String gul ) thr
	ows Exception{
		
		Connection conn = null;
		Statement stmt = null;
		
		try{	
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:XE", "HR","HR");
				
			stmt = conn.createStatement();
			
			String sql = "insert into bangmyung_t values" +
						"( seq_bangmyung.nextval ,'"  + gul + "', sysdate )";
			stmt.executeUpdate( sql );
			
		}catch( Exception e){
			throw e;
		
		}
		
		finally{
			if(stmt != null) { stmt.close(); }
			if (conn != null) { conn.close(); }
			System.out.println("all closed");
		}
	}
	
	public static void main( String[] args ) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		addGul("HelloApple");
	
	}
}
//javac Test103.java
//java -classpath .;ojdbc14.jar Test103

/* �Լ��� �����ؼ� ���뼺�� ������. # COMMIT1
	SQL ���忡�� ���� -> stmt.executeUpdate( sql ) ���� ���� �߻� 
	-> conn.close() ���� ���Ѵ�. (�̰� ū ����. conn�� ��α� ������ ���� ��������Ѵ�.)
	-> try ~ catch ���� ����ؼ� finally �������� close���ش�. 
     # COMMIT2

public class Test103{
	public static void addGul( String gul ) throws Exception{
		
		Connection conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@127.0.0.1:1521:XE", "HR","HR");
			
		Statement stmt = conn.createStatement();

		String sql = "insert into bangmyung_t values" +
					"( seq_bangmyung.nextval ,'"  + gul + "', sysdatXX )";
		stmt.executeUpdate( sql );
		
		stmt.close();
		conn.close();
	}
	
	public static void main( String[] args ) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		addGul("HelloApple");
	
	}
}


----# COMMIT2 ------
public class Test103{
	public static void addGul( String gul ) throws Exception{
		
		Connection conn = null;
		Statement stmt = null;
		
		try{	
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:XE", "HR","HR");
				
			stmt = conn.createStatement();
			
			String sql = "insert into bangmyung_t values" +
						"( seq_bangmyung.nextval ,'"  + gul + "', sysdate )";
			stmt.executeUpdate( sql );
			
		}catch( Exception e){}
		
		finally{
			stmt.close();
			conn.close();
		}
	}
	
	public static void main( String[] args ) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		addGul("HelloApple");
	
	}
}

//finally�� ������ �ȳ��� �ȳ��� ������ ��ġ�� ������ �� �۵��ϵ��� finally ����. 
----- # COMMIT3 ------

public class Test103{
	public static void addGul( String gul ) throws Exception{
		
		Connection conn = null;
		Statement stmt = null;
		
		try{	
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:XE", "HR","HR");
				
			stmt = conn.createStatement();
			
			String sql = "insert into bangmyung_t values" +
						"( seq_bangmyung.nextval ,'"  + gul + "', sysdate )";
			stmt.executeUpdate( sql );
			
		}catch( Exception e){}
		
		finally{
			if(stmt != null) { stmt.close(); }
			if (conn != null) { conn.close(); }
			System.out.println("all closed");
		}
	}
	
	public static void main( String[] args ) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		addGul("HelloApple");
	
	}
}
*/