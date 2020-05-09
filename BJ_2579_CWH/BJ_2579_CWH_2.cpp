#include <stdio.h>
#define max(a,b) ((a > b) ? a : b)
 
int main(void){
    int N, gaedan[301]={};
    int memory[301]={};
    scanf("%d",&N);
    for(int i=1; i<=N; i++){
        scanf(" %d", &gaedan[i]);
        if(i==0)
            memory[i]=0;
        else if(i==1)
            memory[i]=gaedan[i];
        else if(i==2)
            memory[i]=gaedan[i]+gaedan[i-1];
        else
            memory[i]=max(memory[i-2], memory[i-3]+gaedan[i-1])+gaedan[i];
    }
    printf("%d",memory[N]);
}

