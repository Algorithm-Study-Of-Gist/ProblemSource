#include <cstdio>
int main(void){
	int a,b,c;
	int dp[21][21][21]={};
	for(int i=0; i<21; i++){
		for(int j=0; j<21; j++){
			for(int k=0; k<21; k++){
				if((i<=0 || j<=0) || k<=0)
					dp[i][j][k]=1;
				else if(i<j && j<k)
					dp[i][j][k]=dp[i][j][k-1]+dp[i][j-1][k-1]-dp[i][j-1][k];
				else
					dp[i][j][k]=dp[i-1][j][k]+dp[i-1][j-1][k]+dp[i-1][j][k-1]-dp[i-1][j-1][k-1];
			}
		}
	}
	while(1){
		scanf("%d %d %d", &a, &b, &c);
		if(a==-1 && b==-1 && c==-1)
			break;
		else if(a<=0 || b<=0 || c<=0)
			printf("w(%d, %d, %d) = 1\n",a,b,c);
		else if(a>20 || b>20 || c>20)
			printf("w(%d, %d, %d) = %d\n",a,b,c,dp[20][20][20]);
		else
			printf("w(%d, %d, %d) = %d\n",a,b,c,dp[a][b][c]);
	}
}
