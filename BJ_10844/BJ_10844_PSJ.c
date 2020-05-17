#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

int main(void)
{
    long long A[100][10] = { { 0,1,1,1,1,1,1,1,1,1 }, };
    // A[n][i] : 끝자리 숫자가 i인 (n+1)자리 수의 개수.

    int i,j;
    for (i = 1; i < 100; i++)
    {
        A[i][0] = A[i - 1][1];
        A[i][9] = A[i - 1][8];
        for (j = 1; j < 9; j++)
        {
            A[i][j] = (A[i - 1][j - 1] + A[i - 1][j + 1])%1000000000;
        }
    }

    int n;
    scanf("%d", &n);

    long long answer =0;
    
    for (i = 0; i < 10; i++)
    {
        answer += A[n - 1][i];
    }

    int final_answer = answer % 1000000000;

    printf("%d", final_answer);  
}