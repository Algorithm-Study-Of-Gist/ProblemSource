#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

int main()
{
	int n;
	scanf("%d", &n);

	// A는 입력값 저장 배열
	int A[1000] = { 0 };
	// B 는 입력값 원소에 대한 부분증가수열의 원소 개수 저장 배열
	int B[1000] = { 0 };

	int i, j;
	for (i = 0; i < n; i++)
	{
		scanf("%d", &A[i]);

		B[i] = 1 ;
	}

    for (i = 0; i < n; i++)
    {
        printf("%d ", &A[i]);
    }
    print("\n");
    for (i = 0; i < n; i++)
    {
        printf("%d ", &B[i]);
    }
    print("\n");

    int max, inner_max = 0;
    max = B[0];
    for (i = 1; i < n; i++)
    {
        inner_max = 0;
        for (j = i - 1; j >= 0; j--)
        {

            if (A[i] > A[j])
            {
                if (B[j] > inner_max)
                {
                    inner_max = B[j];
                }
            }
        }

        B[i] = inner_max + 1;

        if (B[i] > max)
            max = B[i];
    }

    printf("%d", max);
}