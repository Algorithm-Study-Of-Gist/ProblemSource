#include <cstdio>

int main(){
	int n, jump[2000], dp[2000] = {0};
	scanf("%d", &n);
	
	for(int i=0; i<n; i++)
		scanf("%d", &jump[i]);
	for(int i=1; i<n; i++)
		dp[i] = 99999999;
	
	for(int i=0; i<n; i++){
		for(int j=1; j<=jump[i]; j++){
			dp[i+j] = dp[i+j] > dp[i]+1 ? dp[i]+1 : dp[i+j];
		}
	}
	if(dp[n-1] == 99999999) printf("-1");
	else printf("%d", dp[n-1]);
}
