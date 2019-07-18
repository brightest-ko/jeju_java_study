class Node {
	int data = 0;
	Node next = null;

	Node( int i, Node n ) {
		this.data = i;
		this.next = n;
	}
}

class LinkedList {
	Node head = null;
	Node tail = null;

	LinkedList(){
		this.head = new Node( 0, null );
		this.tail = this.head;
	}

	void add( int i ){
		tail.next = new Node( i, null );
		tail = tail.next;
	}

	void print(){
		for( Node t = head.next ; t != null ; t = t.next ){
			System.out.println( t.data );
		}
	}
}

//LinkedList �ٲ㼭 Stack �����
class Stack{

	Node head = null;
	Node tail = null;
	
	Stack(){
		this.head = new Node( 0, null );
		this.tail = this.head;
	}

	void push( int i ){
		tail.next = new Node( i, null );
		tail = tail.next;
	}
	
	void pop(){
		if(head==tail) System.out.println("WARNNIG :: Empty Stack!");
		else{
			for( Node t = head ; t != null ; t = t.next ){
				if(t.next == tail){
					t.next = null;
					tail = t;
				}
			}
		}
	}
	
	void printAll(){
		for( Node t = head.next ; t != null ; t = t.next ){
			System.out.println( t.data );
		}
	}
}

//LinkedList �ٲ㼭 Queue �����
class Queue{

	Node head = null;
	Node tail = null;
	private int size = 0;
	
	Queue(){
		this.head = new Node( 0, null );
		this.tail = this.head;
		size = 0;
	}

	void enqueue( int i ){
		tail.next = new Node( i, null );
		tail = tail.next;
		size++;
	}
	
	void dequeue(){
		if(size == 0) System.out.println("WARNNIG :: Empty Queue!");
		else{
			Node tmp = head.next.next;
			head.next = null;
			head.next = tmp;
			size--;
		}
	}
	
	void printAll(){
		for( Node t = head.next ; t != null ; t = t.next ){
			System.out.println( t.data );
		}
	}
	int getSize(){
		return size;
	}
}

//LinkedList �̿��ؼ� Stack�����

public class HomeWork {
	public static void main( String[] args ) {
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.pop();
		st.printAll();//10 20
		System.out.println();
		
		st.pop();
		st.pop();
		st.pop(); //WARNNIG
		System.out.println();
		
		st.printAll(); //����
		System.out.println();
		
		Queue qu = new Queue();
		qu.enqueue(10);
		qu.enqueue(20);
		qu.enqueue(30);
		qu.dequeue();
		qu.printAll();//20 30
		System.out.println("Size: "+qu.getSize());
		System.out.println();

		qu.dequeue();
		qu.dequeue();
		qu.dequeue(); //WARNNIG
		System.out.println();
		
		qu.printAll(); //����
		System.out.println();
		
	}
}

//	- ��� ���ư����� ��Ȳ�ľ��� �׸����� ���� ������ ��.


