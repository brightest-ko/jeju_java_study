class Apple{
	int data=0;
	//return ���� �������� �ʴ� �Լ��� �����ƾ�̶� �Ѵ�. 
	//�̷���� return type�� void�� �����ϸ� �ȴ�.
	//�Լ� �ϳ��� ���̰� ũ�ٰ� �ؼ� �ν��Ͻ��� ���� �����ϸ� �޸𸮿� �δ㰡��? NO
	//��? ���ð���: ������ temp04.c������ �м��ؼ� java�� ���ؼ� ����Ʈ �ۼ�.
	void print(){
		System.out.println(this.data);
		//����Լ� �ȿ��� �ڽ��� �Ҽӵ� �ν��Ͻ��� ���� �����͸� ��밡��: this
	}
}
public class Test028{
	public static void main(String[] args){
		Apple t = new Apple();
		t.data = 10;
		t.print();
		Apple l = new Apple();
		l.data = 20;
		l.print();
	}
}