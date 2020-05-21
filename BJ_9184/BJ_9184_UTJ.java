import java.util.*;

class Q9184
{
	public static int w(int a, int b, int c, int[][][] dp){
		if (a<=0 || b<=0 || c<=0)
			return 1;
		if (dp[a][b][c]>0)
			return dp[a][b][c];

		if (a<b && b<c)
                 dp[a][b][c] = w(a,b,c-1,dp)+w(a,b-1,c-1,dp)-w(a,b-1,c,dp);
        else
                 dp[a][b][c] = w(a-1,b,c,dp)+w(a-1,b-1,c,dp)+w(a-1,b,c-1,dp)-w(a-1,b-1,c-1,dp);
        return dp[a][b][c];
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[][][] dp = new int [21][21][21];

		while(1>0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if(a==-1 && b==-1 && c==-1)
				break;
			else if(a>20 || b>20 || c>20){
				System.out.printf("w(%d, %d, %d) = %d", a, b, c, w(20,20,20,dp));
				System.out.println();
				continue;
			}

			System.out.printf("w(%d, %d, %d) = %d", a, b, c, w(a,b,c,dp));
			System.out.println();
		}
	}
}
