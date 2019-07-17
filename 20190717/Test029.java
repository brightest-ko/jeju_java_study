class Node{
	int data = 0;
	Node next = null; //참조형 변수
	
	Node(int i, Node n){
		this.data = i;
		this.next = n;
	}
}
public class Test029{
	public static void main(String[] args){

		Node head = new Node(0, null);
		Node tail = head;
	}
}
/*
	모든 참조형 변수(클래스 이름으로 선언, 인스턴스를 가르키기위한 용도)에는 null이라는 값이 대입 가능
*/