import java.util.*;

class Q11055Second
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int arrSize = sc.nextInt();
		int[] arrN = new int[arrSize];
		for (int i=0;i<arrSize ;i++ )
			arrN[i] = sc.nextInt();
		sc.close();

		int[] arrA  = new int[arrSize];
		arrA[0]=arrN[0];

		int maxSum;
		for (int i=1;i<arrSize ;i++ )
		{
			maxSum=arrN[i];
			for (int j=0;j<i ;j++ )
				if (arrN[i-1-j]< arrN[i] && arrA[i-1-j]+arrN[i]>maxSum)
						maxSum=arrA[i-1-j]+arrN[i];
			arrA[i]=maxSum;
		}

		int ans=arrA[0];
		for (int i=1;i<arrSize ;i++ )
			if (arrA[i]>ans)
				ans = arrA[i];

		System.out.println(ans);
	}
}
