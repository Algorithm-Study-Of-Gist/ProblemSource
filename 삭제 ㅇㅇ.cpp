#include <cstdio>
#include <algorithm>
using namespace std;
int main(void){
	int N, k;
	int coin[101]={};
	int dp[101]={};
	scanf("%d %d", &N, &k);
	for(int i=1; i<=N; i++)	scanf("%d", &coin[i]);
	for(int i=1; i<=k; i++){
		int j=1, mini=987654321;
		while(j<=N){
			if(i-coin[j]>=0)
				mini = min(mini, dp[i-coin[j]]+1);
			j++;
		}
		dp[i]=mini;
	}
	printf("\n%d",dp[k]);
}
