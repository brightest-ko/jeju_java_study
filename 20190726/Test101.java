import java.sql.*;

public class Test101{
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");
		Statement stmt = conn.createStatement();
		
		String[] sql = new String[10];
		String gul = "만나서 반갑습니다";
		sql[0] = "INSERT INTO bangmyung_t VALUES(seq_bangmyung.nextval,'"+gul+"',sysdate)";

		stmt.executeUpdate(sql[0]);
		
		stmt.close();
		conn.close();
	}
}

//javac Test101.java
//java -classpath .;ojdbc14.jar Test101