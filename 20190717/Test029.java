class Node{
	int data = 0;
	Node next = null; //������ ����
	
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
	��� ������ ����(Ŭ���� �̸����� ����, �ν��Ͻ��� ����Ű������ �뵵)���� null�̶�� ���� ���� ����
*/