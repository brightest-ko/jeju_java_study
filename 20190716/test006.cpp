#include <stdio.h>
#include <stdlib.h>

int apple_add(int i, int j){
	return 100;
} 

//�ΰ��� ������ ��� apple�̶�� �̸����� '����ü'�� ���� 
//struct apple{
//	int i;
//	int add;
//};
typedef struct apple{
	int i;
	int (*add)(int, int); //�Լ� ������
}Apple;

//�ν��Ͻ� ������ ������ ������ �ϰ� �ȴ�.
//�̷��� �ؼ� �����ǰ�, �̰��� ����Ű�� �����͸� ���ؼ�
//�Լ��� ������ ���ٵǾ��� �� �ִ�. 
Apple* new_Apple(int j){
	Apple* n;
	n=(Apple*)malloc(sizeof(Apple));
	n->i=j; //�ڹ��� ������ ���� 
	n->add = apple_add;
	return n;
}
int main(){
	//apple ����ü�� �������� ����ų �� �ִ� ������ ���� t ���� 
//	struct apple* t;
	Apple* t;
	
	//����ü ũ���� ������ �Ҵ�. t�����Ͱ� �ش� ������ ����Ŵ 
	//- �� ������ �̸��� ����, �����ͷθ� ������ �����ϴ�.
	//- �� ������ ���ú��� �ƴ�. �ڵ����� �ȵȴ�.
	//- free(t)�� t�� ����Ű�� ���(��, malloc���� ���� ����)�� �����Ѵ�. 
//	t = (struct apple*)malloc(sizeof(struct apple));
//	t = (Apple*)malloc(sizeof(Apple));
	t = new_Apple(100);
	//t�����Ͱ� ����Ű�� ������ i 
//	t->i=100;
//	t->add = apple_add;
//	printf("%d\n", t->i+t->add);
	printf("%d\n", t->i+t->add(10,20));

	free(t);
	return 0;
}
