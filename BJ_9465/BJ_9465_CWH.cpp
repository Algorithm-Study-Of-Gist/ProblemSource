#include <cstdio>
#include <algorithm>
using namespace std;
int main(void){
	int T, n, sticker[2][100001]={}, dp[2][100001], ans;
	dp[0][0]=0;
	dp[1][0]=0;
	//dp[i][j] : i�� j���� �ִ� ��ƼĿ�� ���������� �ִ� ���� 
	scanf("%d",&T);
	for(int i=0; i<T; i++){//T���� case 
		scanf("%d",&n);//���� ���� 
		for(int k=0; k<2; k++){
			for(int j=1; j<=n; j++){
				scanf("%d",&sticker[k][j]);
			}
		}
		for(int j=1; j<=n; j++){
			for(int k=0; k<2; k++){
				if(k==0)
					dp[k][j]=max(dp[1][j-1]+sticker[k][j],dp[1][j-2]+sticker[k][j-1]); 
				else
					dp[k][j]=max(dp[0][j-1]+sticker[k][j],dp[0][j-2]+sticker[k][j-1]); 
			}	
		}
	ans=max(dp[0][n], dp[1][n]);
	printf("%d\n",ans);
	}
}

