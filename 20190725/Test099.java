import java.sql.*;
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
		
		Statement stmt = conn.createStatement();
		System.out.println(stmt);
		
		String sql = "insert into studentt values ('10107','�ǿ�ġ','�ֹ���')";
		String sql2 = "delete from studentt where stid='10107'";
		String sql3 = "update studentt set addr = '�̵���' where stid = '10101'";
		/*
		stmt.executeUpdate(sql) �� insert/delete/update ���忡 ����Ѵ�.
		conn.close() �����ϰ� �ؾ� �Ѵ�. (�� ���°Ŵ�.)
		stmt.close() �� �����ϰ� (�ٱ��� ������ ��)
		conn ���� - stmt���� - �۾� - stmt.close() - conn.close()
		*/
		System.out.println(stmt.executeUpdate(sql));
		System.out.println(stmt.executeUpdate(sql));
		
		/*
		mysql> select * from studentt;
+-------+-----------+-----------+
| stId  | name      | addr      |
+-------+-----------+-----------+
| 10101 | ȫ�浿    | ���ﵿ    |
| 10102 | ��浿    | ������    |
| 10103 | �̱���    | ���ﵿ    |
| 10104 | �ڱ���    | �ѳ���    |
| 10105 | �迵��    | ȫ����    |
| 10106 | �����    | �ѳ���    |
| 10107 | �ǿ�ġ    | �ֹ���    |
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
| 10101 | ȫ�浿    | �̵���    |
| 10102 | ��浿    | ������    |
| 10103 | �̱���    | ���ﵿ    |
| 10104 | �ڱ���    | �ѳ���    |
| 10105 | �迵��    | ȫ����    |
| 10106 | �����    | �ѳ���    |
+-------+-----------+-----------+
6 rows in set (0.00 sec)
		*/
		stmt.close();
		conn.close();
	}
}

//C:\javaWork\jeju_java_study\20190725mysql-connector-java-5.0.8-bin.jar
//jar ������ Ŭ���� ������ �����ؼ� �����ϴ� ����

//javac Test099.java
//java -classpath .;mysql-connector-java-5.0.8-bin.jar Test099

//C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext \ 20190725mysql-connector-java-5.0.8-bin.jar ����
//C:\Program Files\Java\jre7\lib\ext \ 20190725mysql-connector-java-5.0.8-bin.jar ����