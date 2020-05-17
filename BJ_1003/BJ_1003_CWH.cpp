#include <cstdio>
int main(void){
	int T, a, dp[41][2]{{1,0},{0,1},};
	for(int i=2; i<41; i++){
		dp[i][0]=dp[i-1][0]+dp[i-2][0];
		dp[i][1]=dp[i-1][1]+dp[i-2][1];
	}
	scanf("%d",&T);
	for(int j=0; j<T; j++){
		scanf("%d",&a);
		printf("%d %d\n",dp[a][0],dp[a][1]);
	}
} 
