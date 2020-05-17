#include <cstdio>
int main(void){
	long long int Army[68]={1,1,2,4,};
	for(int j=4; j<68; j++){
		Army[j]=Army[j-1] + Army[j-2] + Army[j-3] + Army[j-4];
	}
	int t, a;
	scanf("%d",&t);
	for(int i=0; i<t; i++){
		scanf("%d",&a);
		printf("%lld\n",Army[a]);
	}
}

