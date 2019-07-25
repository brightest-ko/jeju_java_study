import java.sql.*;
public class Test099{
	public static void main( String[] args ) throws Exception{
		Class.forName("com.mysql.jdbc.Driver"); //static
		
		/*
			Connection은 mysql에 소켓으로 접근하는 것과 굉장히 관계가 깊다.
			study : 데이터베이스 명
			root / 1111 : 계정 및 암포
		*/
		Connection conn = DriverManager.getConnection(
			"jdbc:mysql://127.0.0.1:3306/study",
			"root","1111"); //socket을 이용해서 mysql을 접근하는 class겠구나
			
		System.out.println(conn.toString());
		
		Statement stmt = conn.createStatement();
		System.out.println(stmt);
		
		String sql = "insert into studentt values ('10107','또오치','쌍문동')";
		String sql2 = "delete from studentt where stid='10107'";
		String sql3 = "update studentt set addr = '이도동' where stid = '10101'";
		/*
		stmt.executeUpdate(sql) 는 insert/delete/update 문장에 사용한다.
		conn.close() 신중하게 해야 한다. (줄 끊는거다.)
		stmt.close() 도 신중하게 (바구니 내리는 거)
		conn 형성 - stmt형성 - 작업 - stmt.close() - conn.close()
		*/
		System.out.println(stmt.executeUpdate(sql));
		System.out.println(stmt.executeUpdate(sql));
		
		/*
		mysql> select * from studentt;
+-------+-----------+-----------+
| stId  | name      | addr      |
+-------+-----------+-----------+
| 10101 | 홍길동    | 역삼동    |
| 10102 | 고길동    | 개포동    |
| 10103 | 이기자    | 역삼동    |
| 10104 | 박기자    | 한남동    |
| 10105 | 김영삼    | 홍제동    |
| 10106 | 김대중    | 한남동    |
| 10107 | 또오치    | 쌍문동    |
+-------+-----------+-----------+
7 rows in set (0.00 sec)
		*/
		int num = stmt.executeUpdate(sql2);
		System.out.println(num);
		System.out.println(stmt.executeUpdate(sql3));
		
		/*
		mysql> select * from studentt;
+-------+-----------+-----------+
| stId  | name      | addr      |
+-------+-----------+-----------+
| 10101 | 홍길동    | 이도동    |
| 10102 | 고길동    | 개포동    |
| 10103 | 이기자    | 역삼동    |
| 10104 | 박기자    | 한남동    |
| 10105 | 김영삼    | 홍제동    |
| 10106 | 김대중    | 한남동    |
+-------+-----------+-----------+
6 rows in set (0.00 sec)
		*/
		stmt.close();
		conn.close();
	}
}

//C:\javaWork\jeju_java_study\20190725mysql-connector-java-5.0.8-bin.jar
//jar 파일은 클래스 파일을 압축해서 배포하는 파일

//javac Test099.java
//java -classpath .;mysql-connector-java-5.0.8-bin.jar Test099

//C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext \ 20190725mysql-connector-java-5.0.8-bin.jar 복사
//C:\Program Files\Java\jre7\lib\ext \ 20190725mysql-connector-java-5.0.8-bin.jar 복사