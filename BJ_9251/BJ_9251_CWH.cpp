#include <cstdio>
#include <cstring>
#include <algorithm>
using namespace std;
int main(void){
	char s1[1001], s2[1001];
	scanf("%s %s",s1,s2);
	int lens1=strlen(s1), lens2=strlen(s2);
	int s1cnt=0, s2cnt=0;
	short dp[1001][1001]={0,};
	for(s1cnt=1; s1cnt<=lens1; s1cnt++){
		for(s2cnt=1; s2cnt<=lens2; s2cnt++){
			
			if(s1[s1cnt-1]==s2[s2cnt-1])
				dp[s1cnt][s2cnt]=dp[s1cnt-1][s2cnt-1] + 1;
			else{
				dp[s1cnt][s2cnt]=max(dp[s1cnt-1][s2cnt], dp[s1cnt][s2cnt-1]);
			}
		}
	}
	printf("%d",dp[lens1][lens2]);
}
