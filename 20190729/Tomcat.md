# Tomcat

1. 다운 - 압축 풀기 - 안쪽폴더 중 apache-tomcat-8.0.45 C루트로 옮기기
2. 환경 변수 - 시스템변수 설정
   * JAVA_HOME : C:\Program Files\Java\jdk1.7.0_80
   * PATH : %JAVA_HOME%\bin\

3. Tomcat 실행시키기

  * cd C:\apache-tomcat-8.0.45\bin
  * dir (Tomcat 확인하기)
  * startup.bat

4. localhost:8080 실행 (ipconfig localhost=192.168.2.xxx)

  - Oracle XE는 톰캣과 포트번호가 겹침 8080

  - C:\apache-tomcat-8.0.45\conf\server.xml :: 8080=>8081 모두 바꾸기
  - localhost:8081 실행

5. shutdown.bat 접속종료