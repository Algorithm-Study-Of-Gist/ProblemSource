import java.util.*;

class Q10844 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] arrA = new long[n][9]; // 101
		long ans=0;

		if (n>0)
			for (int i=0;i<9 ;i++ )
				arrA[0][i]=1;

		if (n>1){
			for (int i=0;i<9 ;i++ )
				arrA[1][i]=2;
			arrA[1][8]=1;
		}

		if(n>2){
			for(int i=2;i<n;i++){
				arrA[i][0]=(arrA[i-2][0]+arrA[i-1][1])%1000000000;
				for (int j=1;j<8 ;j++ )
					arrA[i][j] = (arrA[i-1][j-1]+arrA[i-1][j+1])%1000000000;
				arrA[i][8]=arrA[i-1][7]%1000000000;
			}
		}

		for (int i=0;i<9 ;i++ )
			ans+=arrA[n-1][i];
		System.out.println(ans%1000000000);
	}
}
