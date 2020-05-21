#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

int main()
{
	int N;
	scanf("%d", &N);

	int dp[1000001] = { 0,1,2 };

	int i;
	for (i = 3; i <= N; i++)
	{
		dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
	}

	printf("%d", dp[N]);
}