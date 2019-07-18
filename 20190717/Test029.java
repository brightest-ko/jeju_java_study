class Node{
	int data = 0;
	Node next = null; //������ ����
	
	Node(int i, Node n){
		this.data = i;
		this.next = n;
	}
}

class LinkedList{
	Node head = null;
	Node tail = null;
	LinkedList(){
		this.head = new Node(0, null);
		this.tail = this.head;
	}
	void add(int d){
		//this ������ �� ����.
		tail.next = new Node(d, null);
		tail = tail.next;
	}
	void print(){
		for(Node n = head.next;n!=null;n=n.next){
			System.out.println(n.data);
		}
	}
}
public class Test029{
	public static void main(String[] args){

/*
		Node head = new Node(0, null);
		Node tail = head;
		tail.next = new Node(10, null);
		tail = tail.next;
		tail.next = new Node(20, null);
		tail = tail.next;
		
		for(Node t = head.next;t!=null;t=t.next){
			System.out.println(t.data);
		}
*/
		
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.print();
		
	}
}
/*
	��� ������ ����(Ŭ���� �̸����� ����, �ν��Ͻ��� ����Ű������ �뵵)���� null�̶�� ���� ���� ����
*/