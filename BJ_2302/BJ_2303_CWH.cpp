#include <cstdio>
int main(void){
	int N, M, cnt=1, t1=0, t2=0;
	scanf("%d %d",&N, &M);
	int dp[41]={1,1,2};
	for(int i=3; i<41; i++){
		dp[i] = dp[i-1] + dp[i-2];
	}
	for(int j=0; j<M; j++){
		scanf("%d",&t2);
		cnt *= dp[t2-t1-1];
		t1=t2;
	}
	cnt =cnt*dp[N-t2];
	printf("%d",cnt);
}
