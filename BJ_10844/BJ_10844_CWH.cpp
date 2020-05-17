#include <cstdio>
int main(void){
	int N, i, ithnum[101][10]={{0,1,1,1,1,1,1,1,1,1}}, sum=0;
	scanf("%d", &N);
	for(int j=1; j<N; j++){
		for(i=0; i<10; i++){
			if(i==0)	ithnum[j][i] += ithnum[j-1][1];
			else if(i==9)	ithnum[j][i] += ithnum[j-1][8];
			else	ithnum[j][i] += ithnum[j-1][i-1] + ithnum[j-1][i+1]; 
			ithnum[j][i] %= 1000000000;
		}
	}
	for(int k=0; k<10; k++){
		sum += ithnum[N-1][k];
		sum = sum % 1000000000;
	}
	printf("%d",sum);
}
