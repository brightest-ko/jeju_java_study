5. # Tomcat

   1. 다운 - 압축 풀기 - 안쪽폴더 중 apache-tomcat-8.0.45 C루트로 옮기기
   2. 환경 변수 - 시스템변수 설정
      - JAVA_HOME : C:\Program Files\Java\jdk1.7.0_80
      - PATH : %JAVA_HOME%\bin\
   3. Tomcat 실행시키기
      - cd C:\apache-tomcat-8.0.45\bin
      - dir (Tomcat 확인하기)
      - startup.bat
   4. localhost:8080 실행 (ipconfig localhost=192.168.2.xxx)
      - Oracle XE는 톰캣과 포트번호가 겹침 8080
      - C:\apache-tomcat-8.0.45\conf\server.xml :: 8080=>8081 모두 바꾸기
      - localhost:8081 실행

   

   클라이언트는 홈 디렉토리 아래의 모든 파일을 다운 가능하다.

   단, WEB-INF 는 접근이 불가능한다. (내부 설정파일 등을 놓는다.)

   - WebC:\studyHome\WEB-INF\classes
   - C:\studyHome\WEB-INF\lib

   classes : java class 파일을 놓는 곳

   lib : 동작에 필요한 jar파일을 놓는 곳

   - copy C:\apache-tomcat-8.0.45\webapps\ROOT\WEB-INF\web.xml

   - to C:\studyHome\WEB-INF\web.xml

     ```xml
     <?xml version="1.0" encoding="ISO-8859-1"?>
     <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                           http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
       version="3.1"
       metadata-complete="true">
     </web-app>
     
     ```

     

   기본적인 Context 설정은 되었다.

   이것을 톰캣에 등록해야 한다.

   - C:\apache-tomcat-8.0.45\conf\server.xml 안에

     ```xml
       <Host name="localhost"  appBase="webapps"
             unpackWARs="true" autoDeploy="true">
     ```

   - 아래

     ```xml
     <Context docBase="C:\studyHome" path="\study" reloadable="true"> </Context>
     <!--docBase::homedir-->
     ```

   - 추가 후 저장

   실행한다.

   - C:\apache-tomcat-8.0.45\bin>startup.bat
   - http://localhost:8081/study/test.html

   

   ------

   * copy C:\apache-tomcat-8.0.45\lib\servlet-api.jar

   * to C:\javaWork\jeju_java_study\20190729\servlet-api.jar

   * C:\javaWork\jeju_java_study\20190729

   * ```java
     package apple;
     
     import javax.servlet.http.HttpServlet;
     import javax.servlet.ServletException;
     import java.io.IOException;
     
     import javax.servlet.http.HttpServletRequest;
     import javax.servlet.http.HttpServletResponse;
     
     
     public class HelloWorld2 extends HttpServlet{
     	public void service( HttpServletRequest request, HttpServletResponse response ) throws IOException, ServletException{
     		System.out.println("HelloWorld2");
     
     	}
     }
     ```

   * ```
     javac -d C:\javaWork\jeju_java_study\20190729\studyHome\WEB-INF\classes -classpath servlet-api.jar HelloWorld2.java
     ```

   * C:\javaWork\jeju_java_study\20190729\studyHome\WEB-INF\web.xml

   ```xml
   <?xml version="1.0" encoding="ISO-8859-1"?>
   <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                         http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
     version="3.1"
     metadata-complete="true">
     
   <servlet>
   	<servlet-name>abcd</servlet-name>
   	<servlet-class>apple.HelloWorld2</servlet-class>
   </servlet>
   <servlet-mapping>
   	<servlet-name>abcd</servlet-name>
   	<url-pattern>/study01</url-pattern>
   </servlet-mapping>
   
   </web-app>
   
   ```

   

   * shutdown.bat

   * startup.bat

   http://localhost:8081/study/study01

![캡처](C:\Users\Hee\Desktop\캡처.PNG)





------

-서블릿의 동작 흐름

0. WAS 쪽에 적절히 설정이 되어 있다고 가정한다.

1. 브라우저에서 /study/study01 으로 요청이 들어온다.

2. /study 로 경로를 설정한 Context 있나? -있음

3. 2에서 찾는 Context의 docBase 폴더 아래의 /WEB-INF/web.xml 참음

4. 거기의 url-pattern 중 /study01 에 해당하는 설정? -있음

5. 이것은  어떤 서블릿 이름을 지명하나? abcd

6. abcd로 이름 붙여진 서블릿 클래스가 있나? -있음 apple.HelloWolrd2

7. apple.HelloWolrd2 을 찾아 -> 인스턴스 생성 -> 오버라이딩하는 service 함수를 호출한다.

8. `System.out.println` 는 Server 쪽에 찍히고

9. ```java
   PrintWriter out = response.getWriter(); //요청해온 곳(response)으로 부터 내보낸다.(PrintWriter out)
   ```

   를 이용하여 내보내는 것은 요청으로 들어온 브라우저 쪽으로 내보내진다.

10. 