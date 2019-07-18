class Node{
	int data = 0;
	Node next = null; //참조형 변수
	
	Node(int i, Node n){
		this.data = i;
		this.next = n;
	}
}
class LinkedList{
	Node head = new Node(0,null);
	Node tail = head;
	
	void add(int data){
		tail.next = new Node(data, null);
		tail = tail.next;
	}
	
	void print(){
		for(Node n = head.next;n!=null;n=n.next){
			System.out.println(n.data);
		}
	}
}

public class Test029_1{
	public static void main(String[] args){
		
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.print();
		
	}
}