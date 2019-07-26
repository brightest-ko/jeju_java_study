import java.sql.*;

// 함수를 호출만 하면 DB에 데이터가 들어가도록 수정하기 . 


public class Test103{
	/* executeUpdate 상황에서 에러나도 conn.close()는 되어야한다. 
	finally 영역은 try 영역에서 에러가 나건 안나건 무조건 시행한다. 
	: stmt.close() conn.close() 를 finally로 옮김. 
	: 변수 선언 정리 ( try- catch- finally) 

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

/* 함수로 선언해서 재사용성을 높였다. # COMMIT1
	SQL 문장에서 에러 -> stmt.executeUpdate( sql ) 에서 예외 발생 
	-> conn.close() 실행 안한다. (이건 큰 문제. conn은 비싸기 때문에 빨리 끊어줘야한다.)
	-> try ~ catch 문을 사용해서 finally 영역에서 close해준다. 
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

//finally는 에러가 안나던 안나던 무조건 거치기 때문에 잘 작동하도록 finally 수정. 
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