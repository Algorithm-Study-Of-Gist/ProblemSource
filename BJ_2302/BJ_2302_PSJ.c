#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
	// N : 총 좌석 수
	int N;
	scanf("%d", &N);

	// M : VIP 고정적 수
	int M;
	scanf("%d", &M);

	// V : [0, vip 지정번호들, N+1] 로 이루어진 배열
	int V[42] = { 0 };

	// V 배열 속 vip 지정번호들 받기
	int i;
	for (i = 1; i <= M; i++)
	{
		scanf("%d", &V[i]);
	}
	V[M+1] = N+1; // V 맨 마지막 인덱스는 N+1


	//	dp 배열 : dp(N) = N개의 좌석에 대해 모든 사람들이 vip가 아닐 경우 경우의 수 : 피보나치

	long long int dp[41] = {1, 1, 2 };

	for (i = 3; i < 41; i++)
	{
		dp[i] = dp[i - 1] + dp[i - 2];
	}

	// split 배열 : M개의 vip로 인해서 양끝 포함 연속된 vip 사이에 몇개의 빈 좌석이 존재하는지
	// split[i] = V[i + 1] - V[i] - 1
	// final 배열 : 양 끝과 vip로 인해서 나눠진 구간(split)에 대한 각각의 경우의 수(dp)를 다 곱해준 최종 답 

	int split[42] = { 0 };
	long long int final = 1;

	for (i = 0; i <= M ; i++)
	{
		split[i] = V[i + 1] - V[i] -1 ;
		final *= dp[split[i]];
	}

	printf("%lld", final);
}