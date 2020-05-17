#include <cstdio>
int main(void){
	int T, left, right, dp[31][31]={0,};
	for(int i=1; i<31; i++){
		for(int j=1; j<31; j++){
			if(i>j)	dp[i][j]=0;
			else if(i==1)	dp[i][j]=j;
			else{
				dp[i][j]=dp[i][j-1]+dp[i-1][j-1];
			}
		}
	}
	scanf("%d", &T);
	for(int i=0; i<T; i++){
		scanf("%d %d",&left, &right);
		printf("%d\n",dp[left][right]);
	}
}
