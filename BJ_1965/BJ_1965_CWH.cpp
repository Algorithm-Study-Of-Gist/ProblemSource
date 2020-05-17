#include <cstdio>
#include <algorithm>
using namespace std;
int main(void){
	int N, A[1001]={}, dp[1001]={}, maxi, ans=-1;
	scanf("%d",&N);
	for(int i=0; i<N; i++){
		scanf(" %d",&A[i]);
		maxi=-1;
		for(int j=0; j<i; j++){
			if(A[j]<A[i])
				maxi=max(maxi, dp[j]+1);
		}
		maxi=max(maxi, 1);
		dp[i]=maxi;
		ans=max(ans, dp[i]);
	}
	printf("%d",ans);
}
