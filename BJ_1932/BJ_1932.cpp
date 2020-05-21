#include <cstdio>
#include <algorithm>
using namespace std;
int main(void){
	int n, tri[501]={}, dp[501][501]={}, ans = -1;
	scanf("%d",&n);
	for(int i=1; i<=n; i++){
		for(int j=1; j<=i; j++){
			scanf("%d",&tri[j]);
			dp[i][j]=max(dp[i-1][j-1],dp[i-1][j])+tri[j];
		}
	}
	for(int k=1; k<=n; k++)	ans=max(ans, dp[n][k]);
	printf("%d", ans);
}
