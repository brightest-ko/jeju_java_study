#include <stdio.h>

float danri( float money, int years, float rate ) {
//	int i=100;
//	float m2=0;
//	
//	for( i = 1 ; i <= 100 ; i++ ){
//		m2 = m2 + money * rate *i;
//	}
	return money+ money * rate *100;
}

float bokri( float money, int years, float rate ) {
	int i;
	for( i = 0 ; i < 100 ; i++ ){
		money = money + money * rate;
	}
	return money;
}

int main(){
    int r;
    float (*fp)(float, int, float);
    
    fp=danri;
    r=fp(100.0,100,0.066);
    printf("%f\n",r);
    
    
    fp=bokri;
    r=fp(100.0,100,0.066);
    printf("%f\n",r);
    
    return 0;
}
