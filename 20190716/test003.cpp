#include <stdio.h>

int main(){
	int i;
	float l;
	void* t;
	
	i = 100;
	l = 3.14;
	t = &i;
	
//	printf("%d\n",t);
//	void* 는 기억공간의 꼭지점을 가르킨다고 보자.
//	가르킬 수는 있지만 실제 접근할 수는 없다. 
 
	int* h;
//	t가 가르키는 지점을 기준으로 int형 기억공간만큼을 확장한 기억공간을 h가 가르킨다. 
	h = (int*)t;
	printf("%d\n",*h);
	
	return 0;
}

//F11: 실행 
