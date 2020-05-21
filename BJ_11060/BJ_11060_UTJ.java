import java.util.*;

class Q11060
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] maze = new int [n];
		for (int i=0;i<n ;i++ )
			maze[i] = sc.nextInt();

		int[] dp = new int [n];
		for (int i=1;i<n ;i++ )
			dp[i]=-1;

		for (int i=0;i<n ;i++ )
			if(dp[i]!=-1)										//¹Ý·Ê 0 1 0
				for (int j=1;j<=maze[i] ;j++ )
					if (i+j<n && dp[i+j]==-1)
						dp[i+j]=dp[i]+1;

		System.out.println(dp[n-1]);
	}
}
