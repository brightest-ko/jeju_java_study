#include <stdio.h>

int bokri(float a, int year, float rate){
	
	float ans;
	ans=a;
	for(int i=0;i<year;i++){
		ans=ans*(rate+1);	
//		printf("%f\n", ans);
		ans=ans+a;
	}
	
	return ans;
}

int main(){
	float r;
	r = bokri(100.0, 100, 0.06);
	printf("%f\n", r);	
	return 0;
}

//F11: ½ÇÇà 
