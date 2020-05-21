import java.util.*;

class Q9567
{
	public static void main(String[] args) 
	{
		long[] kFibo=new long [68];
		kFibo[0]=1; kFibo[1]=1;
		kFibo[2]=2; kFibo[3]=4;
		for (int i=4;i<68 ;i++ )
			kFibo[i]=kFibo[i-1]+kFibo[i-2]+kFibo[i-3]+kFibo[i-4];
		
		Scanner sc = new Scanner(System.in);
		int qNum = sc.nextInt();
		int[] qArr = new int [qNum];
		for (int i=0;i<qNum ;i++ )
			qArr[i] = sc.nextInt();

		for (int i=0;i<qNum ;i++ )
			System.out.println(kFibo[qArr[i]]);
	}
}
