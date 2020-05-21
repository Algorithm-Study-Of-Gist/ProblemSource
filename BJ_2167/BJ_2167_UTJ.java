import java.util.*;

class Q2167
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] n = new int[a][b];
		for(int i=0;i<a;i++)
			for(int j=0;j<b;j++)
				n[i][j]=sc.nextInt();

		int qLen=sc.nextInt();
		int[][][] qArr= new int [qLen][2][2];
		for(int i=0;i<qLen;i++)
			for(int j=0;j<2;j++)
				for(int k=0;k<2;k++)
					qArr[i][j][k]=sc.nextInt();

		int[] aArr = new int [qLen];
		for(int i=0;i<qLen;i++)
			for(int j=qArr[i][0][0]-1;j<qArr[i][1][0];j++)				//i= qArr[i][0][0]-1; i< qArr[i][1][0] - 두개를 뺴준거 
				for (int k=qArr[i][0][1]-1;k<qArr[i][1][1] ;k++ )
					aArr[i]+=n[j][k];

		for (int i=0;i<qLen ;i++ )
			System.out.println(aArr[i]);
	}
}
