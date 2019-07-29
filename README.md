# SW개발자 심화과정(합숙형 Java교육) 

* **Language**
  * **java**  (jdk-7u80-windows-x64)
    * 환경 변수 - 시스템변수 설정
      * JAVA_HOME : C:\Program Files\Java\jdk1.7.0_80
      * PATH : %JAVA_HOME%\bin\
  * C

- **DataBase**
  
  - MySQL 5.6 (mysql-connector-java-5.0.8-bin.jar)
  - Oracle Database 10g Express Edition  (ojdbc14.jar)
    - JDBC jar이용할 때,
      - C:\Program Files\Java\jre7\lib\ext 안에 jar넣어줌
      - C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext  안에 jar넣어줌
  
- **Server**

  - Apache Tomcat 8.0.45 (Web Application Server: WAS)

    - Oracle XE는 톰캣과 포트번호가 겹침 8080

    - C:\apache-tomcat-8.0.45\conf\server.xml :: 8080=>8081

* Code Editor
  * cmd (Path설정 필요 - JAVA, MYSQL)
  
  * Notepad++ (JAVA공부용)
  
  * Dev-C++ (C공부용)
  
  * MySQL 5.6 Command Line Client (MySQL)
  
  * windows-grep-2.3.0.2403 (자료검색용)
  
  * GitHub (Git-2.22.0-64-bit - Window)
  
  * OBS(Open Broadcaster Software) 설정 (노트필기 동영상제작용)
  1. 설정-방송설정-저장경로:C:\OBS\Videos\$T.mp4 / 리플레이 버퍼 파일 경로:C:\OBS\Replay-$T.mp4
    2. 장면추가
    3. 소스목록추가
    4. 소스목록 클릭 - 모니터캡쳐 - 영역표시
    5. 미리보기
    6. 녹화시작
    
  * Eclipse jee mars2
  
    - window - perferences
  
    1. colors and fonts - basic - text fonts -edit -D2Coding 14
    2. colors and fonts - basic - text editor block selection font -edit -D2Coding 14
    3. file association add - *.xml - text edit - default
    4. file association add - *.html - text edit - default
    5. file association add - *.jsp - text edit - default
    6. Spelling - enable 끄기
    7. hyperlinking - enable 끄기
    8. installed JREs - 8/7버전으로 맞추기
    9. Typing - "" () {} 다 끄기
    10. Runtime Environment - add - Apache Tomcat v8.0 - next -  C:\apache-tomcat-8.0.45 & jre7 - finish
    11. OK
  
    - Servers - Tomcat8 추가
  
* Font
  * D2Coding.ttc
  * NanumGothicCoding_Setup-1.65
