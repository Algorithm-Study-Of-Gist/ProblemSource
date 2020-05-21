#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

// 왜 틀렸는지 모르겠어요!!!!!!!!!1ㅠㅠㅠㅠㅠㅠㅠㅠ
int main()
{
	int N;
	scanf("%d", &N);

	int arr[1000] = { 0 };

	int i;
	for (i = 0; i < N; i++)
	{
		scanf("%d", &arr[i]);
	}

	int dp[1000] = { 0 };
	int min;
	int k;
	for (i = 1; i < N; i++)
	{
		min = 101;
		for (k = 0; k < i; k++)
		{
			if ((i - k) <= arr[k])
			{
				if (min > dp[k])
				{
					min = dp[k];
				}
			}
		}

		dp[i] = min + 1;
		
	}
	
	if (dp[N - 1] == 102)
	{
		printf("%d", -1);
	}

	else
	{
		printf("%d", dp[N - 1]);
	}
	return 0;
}