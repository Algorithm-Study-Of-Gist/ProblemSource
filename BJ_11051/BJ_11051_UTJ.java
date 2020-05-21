import java.util.*;

class Q11051
{
	public static int func(int n, int k, int[][]dp){
		if (k==0 || n==k){
			return 1;
		}
		/*
		else if(k==1){
			dp[n-1][k-1]=n;
			return dp[n-1][k-1];
		}
		*/
		else{
			if (dp[n-2][k-2]!=0)
				dp[n-1][k-1] += dp[n-2][k-2]%10007;
			else
				dp[n-1][k-1] += func(n-1,k-1,dp)%10007;

			if (dp[n-2][k-1]!=0)
				dp[n-1][k-1] += dp[n-2][k-1]%10007;
			else
				dp[n-1][k-1] += func(n-1,k,dp)%10007;

			return dp[n-1][k-1];
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
	
		int[][] dp = new int[n][k];
		System.out.println(func(n,k,dp));
	}
}
