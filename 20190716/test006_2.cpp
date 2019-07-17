#include <stdio.h>
#include <stdlib.h>

int add_apple(int i, int j){
	return i+j;
}
typedef struct apple{
	int i;
	int (*add)(int, int);
	
}Apple;
Apple* new_Apple(int j){
	Apple* n;
	n = (Apple*)malloc(sizeof(Apple));
	n->i = j;
	n->add = add_apple;
	return n;
}
int main(){
	Apple* t = new_Apple(100);
	printf("%d",t->i+t->add(10,20));
	free(t);
	return 0;
}
