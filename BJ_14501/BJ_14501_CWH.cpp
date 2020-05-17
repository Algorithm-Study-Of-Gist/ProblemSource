#include <cstdio>
#include <algorithm>
using namespace std;
int main(void){
	int N;
	scanf("%d",&N);
	int Ti[16], Pi[16], dp[16]={}, ans=0;//dp[i]:i번째 날 상담했을때 얻는 가장 높은 금액 
	for(int i=1; i<=N; i++){
		scanf(" %d %d",&Ti[i], &Pi[i]);
	}
	for(int j=N; j>=1; j--){
		dp[j]=Pi[j];
		for(int k=j+Ti[j]; k<=N; k++){
			dp[j]=max(dp[j], Pi[j]+dp[k]);//가장 큰 dp저장 
		}
		if(j+Ti[j]-1>N)//예제의 6, 7일 같은 케이스 
			dp[j]=-1;
		ans=max(ans, dp[j]);
	}
	printf("%d",ans);
}
