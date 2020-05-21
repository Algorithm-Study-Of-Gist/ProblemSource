import java.util.*;

class Q10102nd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int qNum=sc.nextInt();
		int[][] qArr = new int [qNum][2];
		for (int i=0;i<qNum ;i++ ){
			qArr[i][0]=sc.nextInt();
			qArr[i][1]=sc.nextInt();
		}
		int n,m;
	
		for (int l=0;l<qNum ;l++ )
		{
			n=qArr[l][0]; m=qArr[l][1];
			int[][] aArr= new int[n+1][m+1];
			for (int i=n;i<=m ;i++ )
				aArr[n][i]=1;

			for (int i=n-1;i>0 ;i-- )
				for (int j=i;j<=m-n+i ;j++ )
					for (int k=j+1;k<=m;k++ )
						aArr[i][j]+=aArr[i+1][k];

			int ans=0;
			for (int i=0;i<m+1 ;i++ )
				ans+=aArr[1][i];
			System.out.println(ans);
		}
	}
}


/*
import java.util.*;

class Q1010		//재귀를 써서 시간초과 걸림
{
	public static void func(int a, int b, int[] count, int n, int m){
		if (a==n || b==m-n+a){
			count[0]++;
			return;
		}
		else
			for (int i=b+1;i<=m-n+a+1;i++ )
				func(a+1,i,count,n,m);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int qNum=sc.nextInt();
		int[][] qArr = new int [qNum][2];
		for (int i=0;i<qNum ;i++ ){
			qArr[i][0]=sc.nextInt();
			qArr[i][1]=sc.nextInt();
		}
		
		int[] count = new int[1];							// 아직은 int인지 long인지 모른다. 주소로 옮기려고 배열

		for (int i=0;i<qNum ;i++ ){
			count[0]=0;			
			
			for (int j=0;j<qArr[i][1]-qArr[i][0]+1;j++ )
				func(1,j+1,count,qArr[i][0],qArr[i][1]);

			System.out.println(count[0]);
		}
	}
}
*/
