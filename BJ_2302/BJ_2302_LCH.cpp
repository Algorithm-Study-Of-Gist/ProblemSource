#include <cstdio>
#include <cstring>

int main(){
	int n, a, fix[41], dp[41], ans = 1;
	memset(dp, 0, sizeof(dp));
	memset(fix, 0, sizeof(fix));
	scanf("%d %d", &n, &a);
	for(int i=0; i<a; i++){
		int x;
		scanf("%d", &x);
		fix[x]++;
	}
	dp[1] = 1;
	if(fix[1] || fix[2]) dp[2] = 1;
	else dp[2] = 2;
	for(int i=3; i<=n; i++){
		if(fix[i] || fix[i-1]){
			dp[i] = 1;
			ans *= dp[i-1];
		}
		else dp[i] = dp[i-1] + dp[i-2];
	}
	printf("%d", ans * dp[n]);
}
