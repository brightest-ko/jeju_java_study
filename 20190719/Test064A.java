package temp;
public class Test064A{
	public int print(){return 200;}
	public int print2(int i){return 300*i;}
	
	public int print3(){return 100;}
	
}

/*
	��Ű���� ������ Ŭ���� ������ : 
	javac -d [����] Test064A.java 	
	javac -d . Test064A.java
	
	- ��Ű���� ���� ���ϸ� �ڵ����� Unnamed ��Ű���� �Ҽӵȴ�. �̰� ���� ������ ����. 
	
	- ��Ű���� Ŭ������ ����. ���� �� ���� ����. 
	�� ���� �ȿ� ������ ��� Ŭ������ ������ ��Ű���� ���Ѵ�. 
	��� ���� �Ʒ��� ��Ű�� �̸����� ������ �����, �� �Ʒ��� class������ ����.
*/