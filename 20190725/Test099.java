import java.sql.Connection;
import java.sql.DriverManager;

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
		conn.close();
	}
}

//C:\javaWork\jeju_java_study\20190725mysql-connector-java-5.0.8-bin.jar
//jar 파일은 클래스 파일을 압축해서 배포하는 파일

//javac Test099.java
//java -classpath .;mysql-connector-java-5.0.8-bin.jar Test099

//C:\Program Files\Java\jre7\lib\ext \ 20190725mysql-connector-java-5.0.8-bin.jar 복사