#include <cstdio>
int canyouescape(int n){
	int cnt=0;
	for(int i=1; i<=n; i++)
		if(n%i==0)
			cnt++;
	return cnt;
}//�� ������ϴ� �Լ��� 
int main(void){
	int T, room, dp[101]={0,1};
	scanf("%d",&T);
	for(int j=2; j<=100; j++){
		if(canyouescape(j)%2!=0)//����� ������ Ȧ���� ��� 
			dp[j]=dp[j-1]+1;
		else
			dp[j]=dp[j-1];//¦�� 
	}
	for(int i=1; i<=T; i++){
		scanf("%d",&room);
		printf("%d\n",dp[room]);
	}
} 
