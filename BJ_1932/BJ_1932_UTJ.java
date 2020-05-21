import java.util.*;

class Q1932
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] triangle = new int[n][n];
		for (int i=0;i<n ;i++ )
			for (int j=0;j<=i ;j++ )
				triangle[i][j] = sc.nextInt();

		int[][] dp = new int [n][n];
		dp[0][0]=triangle[0][0];
		for (int i=1;i<n ;i++ )
			for (int j=0;j<=i ;j++ ){
				if (j==0)
					dp[i][j] = dp[i-1][j] + triangle[i][j];
				else if (j==i)
					dp[i][j] = dp[i-1][j-1] + triangle [i][j];
				else{
					if (dp[i-1][j-1] > dp[i-1][j])
						dp[i][j] = dp[i-1][j-1] + triangle[i][j];
					else
						dp[i][j] = dp[i-1][j] + triangle[i][j];
				}
			}

		int max = dp[n-1][0];
		for (int i=1;i<n ;i++ )
			if (max < dp[n-1][i])
				max = dp[n-1][i];

		System.out.println(max);
	}
}
