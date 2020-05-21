#include <cstdio>
#include <algorithm>
using namespace std;
int main(void){
	int N, jump[1001], dp[1001]={};
	scanf("%d", &N);
	for(int i=1; i<=N; i++){
		scanf(" %d", &jump[i]);
		dp[i]=987654321;
	}
	dp[1]=0;
	for(int j=1; j<=N; j++){
		for(int k=0; k<=jump[j]; k++){
			if((j+k)<=N)
				dp[j+k]=min(dp[j]+1,dp[j+k]);
		}
	}
	if(dp[N]==987654321)	printf("-1");
	else	printf("%d",dp[N]);
}
