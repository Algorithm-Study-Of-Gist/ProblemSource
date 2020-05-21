import java.util.*;

class Q1965
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
		arrA[0]=1;

		int maxCount;
		for (int i=1;i<arrSize ;i++ )
		{
			maxCount=1;
			for (int j=0;j<i ;j++ )
				if (arrN[i-1-j]< arrN[i] && arrA[i-1-j]+1>maxCount)
						maxCount=arrA[i-1-j]+1;
			arrA[i]=maxCount;
		}

		int ans=arrA[0];
		for (int i=1;i<arrSize ;i++ )
			if (arrA[i]>ans)
				ans = arrA[i];

		System.out.println(ans);
	}
}
