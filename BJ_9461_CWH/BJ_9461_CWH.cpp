#include <stdio.h>
long long N[101]={1,1,1,2,2,3,4,5,7,9,};
 
int main(void){
    for(int i=10; i<101; i++){
        N[i]=N[i-1]+N[i-5];
    }    
    int T;
    scanf("%d",&T); 
    int test;
    for(int j=0; j<T; j++){
        scanf(" %d",&test);
        printf("%lld\n",N[test-1]);
    }
}
