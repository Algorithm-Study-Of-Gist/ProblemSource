#include <cstdio>
#include <algorithm>
using namespace std;

int main(){
	int a[501][501] = {}, n;
	scanf("%d", &n);
	for(int i=1; i<=n; i++)
		for(int j=1; j<=i; j++)
			scanf("%d", &a[i][j]);
	for(int i=1; i<n; i++){
		for(int j=1; j<=i+1; j++)
			a[i+1][j] += max(a[i][j], a[i][j-1]);
	}
	int ans = 0;
	for(int i=1; i<=n; i++)
		if(ans < a[n][i]) ans = a[n][i];
	
	printf("%d", ans);
}
