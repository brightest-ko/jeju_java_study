/*
package temp;
import java.io.*;
import java.util.*;

//import java.io.Serializable; 직렬화
class Score{
	String studentID;
	int grade;
	Score(String s, int g){
		studentID = s;
		grade = g;
	}
}

public class Test088{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = null;
		
		LinkedList<Score> score_list = null; //while문이 돌때마다 생성하면 안되니까.
		while(!"quit".equals(l)){
			System.out.println();
			System.out.println();
			System.out.println("[ M E N U ]");
			System.out.println("1. 새 자료");
			System.out.println("2. 자료 입력");
			System.out.println("3. 파일로 저장");
			System.out.println("4. 파일에서 불러오기");
			l = br.readLine();
			System.out.println();

		
			if(l.equals("1")){
				score_list = new LinkedList<Score>();
				System.out.println("새 자료 생성완료");
				
			}else if(l.equals("2")){
				//String data = "10101, 100";
				System.out.println("데이터를 입력하세요[학번,점수]: (ex. \'10101,100\')");
				String data = br.readLine();
				String[] array = data.split(",");
//				System.out.println(array[0]);
//				System.out.println(Integer.parseInt(array[1]));
				
				Score tmp = new Score(array[0],Integer.parseInt(array[1]));
				//System.out.println(tmp.studentID);
				//System.out.println(tmp.grade);
				score_list.add(tmp);
				System.out.println("자료가 추가됐습니다.");
				
			}else if(l.equals("3")){
				//String l2 = "score.dat";
				System.out.println("저장될 파일 이름을 입력하세요:");
				String fileName = br.readLine(); //data.dat
				System.out.println("====="+fileName+"=====");
				
				//https://hyeonstorage.tistory.com/252
				ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(fileName));
				for( Score t : score_list ) {
					oout.writeUTF(t.studentID+", "+Integer.toString(t.grade));
				}
				oout.close();
				System.out.println("파일로 저장했습니다.");
				System.out.println("=================");

			}else if(l.equals("4")){
				//String l2 = "score.dat";
				System.out.println("불러올 파일 이름을 입력하세요:");
				String fileName = br.readLine();
				System.out.println("파일에서 불러왔습니다.");
				System.out.println("====="+fileName+"=====");
				ObjectInputStream oin = new ObjectInputStream(new FileInputStream(fileName));
				boolean keepGo=true;
				while(keepGo){
					try{
						System.out.println(oin.readUTF());
					}catch(Exception e){
						keepGo = false;
					}
				}
				oin.close();
				System.out.println("=================");
				
			}
		}
		br.close();
	}
}
//펲 뷁

//LinkedList ::068

*/

import java.io.*;

class Student <Score extends Object> {
    Score number = null; // 학번
	Score grade = null; // 성적
    Student<Score> next = null; // 다음학생
    Student (Score i,Score j,Student<Score> n){
        number = i;
		grade = j;
        next = n;
    }
}
class LinkedList <Score extends Object>{
    Student<Score> head = null;
    Student<Score> tail = null;
    
    LinkedList(){
        this.head = new Student<Score>(null,null,null);
        this.tail = this.head;
    }
    void add(Score i,Score j){
        tail.next = new Student<Score>(i,j,null);
        tail = tail.next;
    }
    void print(){
        for(Student p = head.next; p!=null; p=p.next){
            System.out.println(p.number+","+p.grade);
        }
    }
}

public class Test088 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( 
			new InputStreamReader( System.in ));
		String l = null;
		
		LinkedList<String> m = null;
		while( true ) {
			System.out.println("[M E N U]");
			System.out.println("1. 새 자료");
			System.out.println("2. 자료 입력");
			System.out.println("3. 파일로 저장");
			System.out.println("4. 파일에서 불러오기");
			
			l = br.readLine();
			
			if ( l.equals("1") ) {
				m = new LinkedList<String>();
			}
			else if ( l.equals("2") ) {
				//String l = "10101,100"; //10101학번의 학생의 성적은 100점으로 넣어줘야함
				l = br.readLine();
				String datas[] = l.split(",");
				m.add(datas[0],datas[1]); // 학번과 성적 
			}
			else if ( l.equals("3") ) {
				//String l = "score.dat"
				System.out.println("저장할 파일명을 입력하세요");
				l = br.readLine();
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(l));
				out.writeObject(m); //노드를 씀
				out.close();
			}
			else if ( l.equals("4") ) {
				System.out.println("불러올 파일명을 입력하세요");
				l = br.readLine();
				//파일 읽어들이기
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(l));
				String r = (String)in.readObject(l);
				//r = in.read();
				System.out.println(r);
				in.close();
			}
			else if ( l.equals("quit") ){
				break;
			}	
			
			
			System.out.println("> "+l);
		}
		br.close();
	}
}