#include <cstdio>
int main(void){
	int array[301][301];
	int dp[301][301]={};
	int N, M, K, x1, y1, x2, y2; 
	scanf("%d %d",&N, &M);
	for(int i=1; i<=N; i++){
		for(int j=1; j<=M; j++){
			scanf(" %d",&array[i][j]);
			dp[i][j]+=array[i][j];
			dp[i][j]+=dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
		}
	}// ������ �迭 �Է¹ޱ� �� dp�迭 ���� 
	
	scanf("%d",&K);
	for(int i=0; i<K; i++){
		int cnt=0;
		scanf(" %d %d %d %d", &x1, &y1, &x2, &y2);//�� case�Է¹ޱ� 
		printf("%d\n",dp[x2][y2]-dp[x1-1][y2]-dp[x2][y1-1]+dp[x1-1][y1-1]);
	}	
} 

