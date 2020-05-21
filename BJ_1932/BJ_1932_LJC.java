package BJ_1932_LJC;

import java.util.Scanner;

public class BJ_1932_LJC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i,j;
		int[][] a = new int[n+1][n+1];
		int[][] dp = new int[n+1][n+1];
		for(i=1;i<n+1;i++) {
			for(j=1;j<=i;j++) {
				dp[i][j]= input.nextInt();
			}
		}
		
		for(i=2;i<n+1;i++) {
			for(j=1;j<=i;j++) {
				if(dp[i-1][j-1]>dp[i-1][j]) {
					dp[i][j] += dp[i-1][j-1];
				}
				else {
					dp[i][j] += dp[i-1][j];
				}
			}
		}
		int ans = dp[n][0];
		for(i=1;i<n+1;i++) {
			if(dp[n][i] > dp[n][i-1]) {
				ans = dp[n][i];
			}
		}
		System.out.printf("%d", ans);
	}

}
