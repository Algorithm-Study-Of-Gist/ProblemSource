#include <cstdio>
int main(void){
    int N;
    scanf("%d",&N);
    int cnt1=1, cnt2=2, cnt3;
    if(N<3)    cnt3 = (N == 1) ? 1 : 2 ;
    else{
        N=N-2;
        while(N--){
        cnt3=(cnt1 + cnt2)%15746;
        cnt1=cnt2;
        cnt2=cnt3;
        }
    }
    printf("%d",cnt3);
    
}

