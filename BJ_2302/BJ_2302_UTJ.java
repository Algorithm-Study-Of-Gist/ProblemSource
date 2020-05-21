import java.util.*;

class Q2302
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int vip = sc.nextInt();
		int[] vArr = new int[vip];
		for (int i=0;i<vip ;i++ )
			vArr[i] = sc.nextInt();

		int[] aArr = new int [vip+1];
		aArr[0] = vArr[0]-1;
		for (int i=0;i<vip-1 ;i++ )
			aArr[i+1] = vArr[i+1]-vArr[i]-1;
		aArr[vip] = n-vArr[vip-1];
		
		int max = aArr[0];
		for (int i=1;i<vip+1 ;i++ )
			if(max<aArr[i])
				max = aArr[i];

		System.out.println(max);

		int[] fibo = new int [max];

	}
}
