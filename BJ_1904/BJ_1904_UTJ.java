import java.util.*;

class Q1904
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp = new int [n][2];
		
		dp[0][0]=0; dp[0][1]=1;
		for (int i=1;i<n ;i++){
			dp[i][0]=(dp[i-1][1])%15746;
			dp[i][1]=(dp[i-1][0]+dp[i-1][1])%15746;
		}

		System.out.println((dp[n-1][0]+dp[n-1][1])%15746);
	}
}
