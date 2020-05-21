import java.util.*;

class Q9465
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int qNum=sc.nextInt();
		int[] aArr=new int[qNum]; 
		int n;

		for(int k=0;k<qNum;k++){
			n= sc.nextInt();
			int[][] nArr = new int[2][n];
			for (int i=0;i<2 ;i++ )
				for (int j=0;j<n ;j++ )
					nArr[i][j]=sc.nextInt();
			
			int[][] dp = new int [2][n+1];
			dp[0][0]=0; dp[1][0]=0;
			dp[0][1]=nArr[0][0];
			dp[1][1]=nArr[1][0];

			for (int i=2;i<=n ;i++ ){
				if (dp[1][i-1]>dp[1][i-2])
					dp[0][i] = dp[1][i-1]+nArr[0][i-1];
				else
					dp[0][i] = dp[1][i-2]+nArr[0][i-1];

				if (dp[0][i-1]>dp[0][i-2])
					dp[1][i] = dp[0][i-1]+nArr[1][i-1];
				else
					dp[1][i] = dp[0][i-2]+nArr[1][i-1];
			}

			aArr[k] = dp[0][n]>dp[1][n] ? dp[0][n] : dp[1][n];
		}

		for (int i=0;i<qNum ;i++ )
			System.out.println(aArr[i]);
	}
}