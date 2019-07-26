import java.sql.*;
import java.util.*;

class BangmyungVO{
	private Integer no = null;
	public void setNo(Integer i){no = i;}
	public int getNo(){return no;}
	
	private String gul = null;
	public void setGul(String i){gul = i;}
	public String getGul(){return gul;}
	
	private String thTime = null;
	public void setThTime(String i){thTime = i;}
	public String getThTime(){return thTime;}
	
}
public class Test102{
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");
		Statement stmt = conn.createStatement();
		
		String[] sql = new String[10];
		String gul = "만나서 반갑습니다";
		sql[0] = "INSERT INTO bangmyung_t VALUES(seq_bangmyung.nextval,'"+gul+"',sysdate)";
		sql[1] = "select * from bangmyung_t";
		
		stmt.executeUpdate(sql[0]);
		ResultSet rs = stmt.executeQuery(sql[1]);
		
		List<BangmyungVO> ls = new ArrayList<BangmyungVO>();
		while(rs.next()){
			BangmyungVO vo = new BangmyungVO();
			
			vo.setNo(rs.getInt("no"));
			vo.setGul(rs.getString("gul"));
			vo.setThTime(rs.getString("the_time"));
			ls.add(vo);
		}
		rs.close();
		stmt.close();
		conn.close();
		
		for(BangmyungVO vo:ls){
			System.out.println(vo.getNo()+"\t"+vo.getGul()+"\t"+vo.getThTime()+"\t");
		}
	}

}

//javac Test101.java
//java -classpath .;ojdbc14.jar Test101