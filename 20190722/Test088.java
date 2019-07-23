/*
package temp;
import java.io.*;
import java.util.*;

//import java.io.Serializable; ����ȭ
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
		
		LinkedList<Score> score_list = null; //while���� �������� �����ϸ� �ȵǴϱ�.
		while(!"quit".equals(l)){
			System.out.println();
			System.out.println();
			System.out.println("[ M E N U ]");
			System.out.println("1. �� �ڷ�");
			System.out.println("2. �ڷ� �Է�");
			System.out.println("3. ���Ϸ� ����");
			System.out.println("4. ���Ͽ��� �ҷ�����");
			l = br.readLine();
			System.out.println();

		
			if(l.equals("1")){
				score_list = new LinkedList<Score>();
				System.out.println("�� �ڷ� �����Ϸ�");
				
			}else if(l.equals("2")){
				//String data = "10101, 100";
				System.out.println("�����͸� �Է��ϼ���[�й�,����]: (ex. \'10101,100\')");
				String data = br.readLine();
				String[] array = data.split(",");
//				System.out.println(array[0]);
//				System.out.println(Integer.parseInt(array[1]));
				
				Score tmp = new Score(array[0],Integer.parseInt(array[1]));
				//System.out.println(tmp.studentID);
				//System.out.println(tmp.grade);
				score_list.add(tmp);
				System.out.println("�ڷᰡ �߰��ƽ��ϴ�.");
				
			}else if(l.equals("3")){
				//String l2 = "score.dat";
				System.out.println("����� ���� �̸��� �Է��ϼ���:");
				String fileName = br.readLine(); //data.dat
				System.out.println("====="+fileName+"=====");
				
				//https://hyeonstorage.tistory.com/252
				ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(fileName));
				for( Score t : score_list ) {
					oout.writeUTF(t.studentID+", "+Integer.toString(t.grade));
				}
				oout.close();
				System.out.println("���Ϸ� �����߽��ϴ�.");
				System.out.println("=================");

			}else if(l.equals("4")){
				//String l2 = "score.dat";
				System.out.println("�ҷ��� ���� �̸��� �Է��ϼ���:");
				String fileName = br.readLine();
				System.out.println("���Ͽ��� �ҷ��Խ��ϴ�.");
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
//�� ��

//LinkedList ::068

*/

import java.io.*;

class Student <Score extends Object> {
    Score number = null; // �й�
	Score grade = null; // ����
    Student<Score> next = null; // �����л�
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
			System.out.println("1. �� �ڷ�");
			System.out.println("2. �ڷ� �Է�");
			System.out.println("3. ���Ϸ� ����");
			System.out.println("4. ���Ͽ��� �ҷ�����");
			
			l = br.readLine();
			
			if ( l.equals("1") ) {
				m = new LinkedList<String>();
			}
			else if ( l.equals("2") ) {
				//String l = "10101,100"; //10101�й��� �л��� ������ 100������ �־������
				l = br.readLine();
				String datas[] = l.split(",");
				m.add(datas[0],datas[1]); // �й��� ���� 
			}
			else if ( l.equals("3") ) {
				//String l = "score.dat"
				System.out.println("������ ���ϸ��� �Է��ϼ���");
				l = br.readLine();
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(l));
				out.writeObject(m); //��带 ��
				out.close();
			}
			else if ( l.equals("4") ) {
				System.out.println("�ҷ��� ���ϸ��� �Է��ϼ���");
				l = br.readLine();
				//���� �о���̱�
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