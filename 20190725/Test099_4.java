import java.sql.*;
import java.util.*;

class StudentVO{ //VO:
	private String stid;
	private String name;
	private String addr;
	
	void setStid(String stid){
		this.stid = stid;
	}
	String getStid(){
		return stid;
	}
	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}
	void setAddr(String addr){
		this.addr = addr;
	}
	String getAddr(){
		return addr;
	}
	@Override
	public String toString(){
		return "stid :"+stid+"\tname: "+name+"\tarrd:"+addr;
	}
}
public class Test099_4{
	public static void main( String[] args ) throws Exception{
		Class.forName("com.mysql.jdbc.Driver"); //Driver가 load됨
		Connection conn = DriverManager.getConnection(
			"jdbc:mysql://127.0.0.1:3306/study","root","1111");
		System.out.println(conn.getClass().getName());
		Statement stmt = conn.createStatement();

		/*
			O-R mapping 규칙( Golden Rule, Rule of Thumb )
			filed => property
			table => class
			record =>instance
		*/
		
		List<StudentVO> rl = new ArrayList<StudentVO>();
		//왜 ArrayList?
		
		String sql = "select * from studentt";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			StudentVO st = new StudentVO();
			st.setStid(rs.getString("stid"));
			st.setName(rs.getString("name"));
			st.setAddr(rs.getString("addr"));
			//System.out.println(stid+"\t"+name+"\t"+addr);
			//System.out.println(st.toString());
			rl.add(st);
		}
		rs.close();
		stmt.close();
		conn.close();
		
		//conn.close() 이후에도 List안에는 결과가 담겨 있다.
		for(StudentVO vo : rl){
			System.out.println(vo.getStid()+"\t"+vo.getName()+"\t"+vo.getAddr());
			System.out.println(vo.toString());
		
		}
	}
}
