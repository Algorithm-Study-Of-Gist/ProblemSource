#include <cstdio>
#include <algorithm>
using namespace std;
int dp[2001][2001]={};
int main(void){
	int N, left[2001]={}, right[2001]={}, leftmax=-1, score=0;
	scanf("%d",&N);
	for(int i=N; i>0; i--)	scanf(" %d",&left[i]);	
	for(int j=N; j>0; j--)	scanf(" %d",&right[j]);	
	for(int x=1; x<=N; x++){
		for(int y=1; y<=N; y++){
			dp[x][y]=max(dp[x-1][y-1],dp[x-1][y]);
			if(left[x]>right[y])
				dp[x][y]=max(dp[x][y],dp[x][y-1]+right[y]);
		}
	}
	printf("%d",dp[N][N]);
}
