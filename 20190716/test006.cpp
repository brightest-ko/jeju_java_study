#include <stdio.h>
#include <stdlib.h>

int apple_add(int i, int j){
	return 100;
} 

//두개의 변수를 묶어서 apple이라는 이름으로 '구조체'를 정의 
//struct apple{
//	int i;
//	int add;
//};
typedef struct apple{
	int i;
	int (*add)(int, int); //함수 포인터
}Apple;

//인스턴스 생성과 유사한 동작을 하게 된다.
//이렇게 해서 생성되고, 이것을 가리키는 포인터를 통해서
//함수과 변수가 접근되어질 수 있다. 
Apple* new_Apple(int j){
	Apple* n;
	n=(Apple*)malloc(sizeof(Apple));
	n->i=j; //자바의 생성자 역할 
	n->add = apple_add;
	return n;
}
int main(){
	//apple 구조체의 기억공간을 가리킬 수 있는 포인터 변수 t 선언 
//	struct apple* t;
	Apple* t;
	
	//구조체 크기의 기억공간 할당. t포인터가 해당 공간을 가리킴 
	//- 이 공간은 이름이 없고, 포인터로만 접근이 가능하다.
	//- 이 공간은 로컬변수 아님. 자동삭제 안된다.
	//- free(t)는 t가 가르키는 대상(즉, malloc으로 잡힌 공간)을 삭제한다. 
//	t = (struct apple*)malloc(sizeof(struct apple));
//	t = (Apple*)malloc(sizeof(Apple));
	t = new_Apple(100);
	//t포인터가 가르키는 대상안의 i 
//	t->i=100;
//	t->add = apple_add;
//	printf("%d\n", t->i+t->add);
	printf("%d\n", t->i+t->add(10,20));

	free(t);
	return 0;
}
