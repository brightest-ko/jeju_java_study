package temp;
import java.sql.*;
import java.util.*;

//javac -d . -calsspath . BangMyungDAO.java
public class BangMyungDAO{
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){}
	}
	public static void addGul( String gul ) throws Exception{
		Connection conn = null;
		Statement stmt = null;
		try{	
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "HR","HR");
			stmt = conn.createStatement();
			String sql = "insert into bangmyung_t values" +
						"( seq_bangmyung.nextval ,'"  + gul + "', sysdate )";
			stmt.executeUpdate( sql );
			
		}catch( Exception e){throw e;
		}finally{
			if(stmt != null) { stmt.close(); }
			if (conn != null) { conn.close(); }
			System.out.println("all closed");
		}
	}

	public static List<BangMyungVO> findAll() throws Exception{
		List<BangMyungVO> ls = new ArrayList<BangMyungVO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","HR","HR");
			stmt = conn.createStatement();
      
			String sql = "select * from bangmyung_t";
			rs = stmt.executeQuery(sql);  
	  
			while(rs.next()){
				BangMyungVO vo = new BangMyungVO();   
				vo.setNo(rs.getInt("no"));
				vo.setGul(rs.getString("gul"));
				vo.setTheTime(rs.getString("the_time"));   
				ls.add(vo);
			}

		}catch(Exception e){ throw e;
		}finally{
			if(rs != null ) rs.close();
			if(stmt != null ) stmt.close();
			if(conn != null ) conn.close();
			System.out.println("All closed");
		}
		return ls;
	}
    
}