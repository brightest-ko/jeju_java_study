import java.sql.Connection;
import java.sql.DriverManager;

public class Test099{
	public static void main( String[] args ) throws Exception{
		Class.forName("com.mysql.jdbc.Driver"); //static
		
		/*
			Connection�� mysql�� �������� �����ϴ� �Ͱ� ������ ���谡 ���.
			study : �����ͺ��̽� ��
			root / 1111 : ���� �� ����
		*/
		Connection conn = DriverManager.getConnection(
			"jdbc:mysql://127.0.0.1:3306/study",
			"root","1111"); //socket�� �̿��ؼ� mysql�� �����ϴ� class�ڱ���
			
		System.out.println(conn.toString());
		conn.close();
	}
}

//C:\javaWork\jeju_java_study\20190725mysql-connector-java-5.0.8-bin.jar
//jar ������ Ŭ���� ������ �����ؼ� �����ϴ� ����

//javac Test099.java
//java -classpath .;mysql-connector-java-5.0.8-bin.jar Test099

//C:\Program Files\Java\jre7\lib\ext \ 20190725mysql-connector-java-5.0.8-bin.jar ����