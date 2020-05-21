import java.util.*;

class Q1003
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int qNum = sc.nextInt();
		int[] qArr = new int [qNum];
		for (int i=0;i<qNum ;i++ )
			qArr[i] = sc.nextInt();
		
		for (int i=0;i<qNum ;i++ )
		{
			switch (qArr[i]){
				case 0:
					System.out.println("1 0");
					break;
				case 1:
					System.out.println("0 1");
					break;
				default:																		//2이상 40 이하일 때
						int[][] fibo = new int [qArr[i]+1][2];
						fibo[0][0]=1; fibo[0][1]=0; 
						fibo[1][0]=0; fibo[1][1]=1;
						for (int j=2;j<=qArr[i] ;j++ ){
							fibo[j][0]=fibo[j-1][0] + fibo[j-2][0];
							fibo[j][1]=fibo[j-1][1] + fibo[j-2][1];
						}
						System.out.printf("%d %d%n", fibo[qArr[i]][0], fibo[qArr[i]][1]);
			}
		}
	}
}
