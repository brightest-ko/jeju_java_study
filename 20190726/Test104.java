import java.sql.*;
import java.util.*;


class BangMyungVO{
	private Integer no = null;
	public void setNo(Integer i){no = i;}
	public int getNo(){return no;}
	
	private String gul = null;
	public void setGul(String i){gul = i;}
	public String getGul(){return gul;}
	
	private String thTime = null;
	public void setTheTime(String i){thTime = i;}
	public String getTheTime(){return thTime;}
	
}

public class Test104{
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
   
      public static void main(String[] args) throws Exception{
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         List<BangMyungVO> ls2 = findAll();
         
         for(BangMyungVO t : ls2){
            System.out.println( t.getNo()+"\t"+t.getGul()+"\t"+t.getTheTime());
      }
   }
}