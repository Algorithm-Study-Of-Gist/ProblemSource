#include <cstdio>
#include <algorithm>
using namespace std;
int main(void){
	int N;
	scanf("%d",&N);
	int Ti[16], Pi[16], dp[16]={}, ans=0;//dp[i]:i��° �� ��������� ��� ���� ���� �ݾ� 
	for(int i=1; i<=N; i++){
		scanf(" %d %d",&Ti[i], &Pi[i]);
	}
	for(int j=N; j>=1; j--){
		dp[j]=Pi[j];
		for(int k=j+Ti[j]; k<=N; k++){
			dp[j]=max(dp[j], Pi[j]+dp[k]);//���� ū dp���� 
		}
		if(j+Ti[j]-1>N)//������ 6, 7�� ���� ���̽� 
			dp[j]=-1;
		ans=max(ans, dp[j]);
	}
	printf("%d",ans);
}
