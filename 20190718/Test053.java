class Node<T extends Object>{
	T data = null;
	Node<T> next = null;
	
	Node(T i, Node<T> n){
		data = i;
		next = n;
	}
}

class LinkedList<T extends Object>{
	Node<T> head = new Node<T>(null, null);
	Node<T> tail = head;
	void add(T data){
		tail.next = new Node<T>(data,null);
		tail = tail.next;
	}
	void print(){
		for(Node<T> n = head.next; n!=null;n=n.next){
			System.out.println(n.data);
		}
	}
}

public class Test053{
	public static void main(String[] args) throws Exception{
		add("apple");
		add("banana");
		add("orange");
		add("kiwi");
		print();
	/*
		tail.next = new Node<String>("apple",null);
		tail = tail.next;
		tail.next = new Node<String>("banana",null);
		tail = tail.next;
		tail.next = new Node<String>("orange",null);
		tail = tail.next;
		tail.next = new Node<String>("kiwi",null);
		tail = tail.next;
		
		for(Node<String> n = head.next; n!=null;n=n.next){
			System.out.println(n.data);
		}
	*/
	}
}