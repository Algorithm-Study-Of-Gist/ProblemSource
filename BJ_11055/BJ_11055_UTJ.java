import java.util.*;

class Q11055 
{
	public static void funcQ(int[] arrA, int[] arrQ, int i){
		int newAns = arrA[i];
		int nowInt = arrA[i];

		for (int j=1;j<=i ;j++ )
			if (nowInt > arrA[i-j]){
				newAns += arrA[i-j];
				nowInt = arrA[i-j];
			}

		if (newAns > arrQ[i-1])
			arrQ[i] = newAns;
		else
			arrQ[i] = arrQ[i-1];
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int arrSize = sc.nextInt();
		int[] arrA = new int[arrSize];
		for (int i=0;i<arrSize ;i++ )
			arrA[i] = sc.nextInt();
		sc.close();

		int[] arrQ = new int[arrSize];
		arrQ[0] = arrA[0];
		
		for (int i=1;i<arrSize ;i++ )
			funcQ(arrA, arrQ, i);

		System.out.println(arrQ[arrSize-1]);
	}
}
