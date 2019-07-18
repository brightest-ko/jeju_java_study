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

//LinkedList 바꿔서 Stack 만들기
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

//LinkedList 바꿔서 Queue 만들기
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

//LinkedList 이용해서 Stack만들기

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
		
		st.printAll(); //없음
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
		
		qu.printAll(); //없음
		System.out.println();
		
	}
}

//	- 어떻게 돌아가는지 상황파악을 그림으로 설명 가능할 것.


