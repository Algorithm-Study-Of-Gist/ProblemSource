import java.util.*;

class Q14501
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] qArr = new int [n][2];
		for (int i=0;i<n ;i++ ){
			qArr[i][0]=sc.nextInt();
			qArr[i][1]=sc.nextInt();
		}

		int[] aArr = new int [n+1];													//한칸  더 있음. 마지막 칸은 0: 초기값
		if (qArr[n-1][0]==1)
			aArr[n-1]=qArr[n-1][1];													//초기값

		for (int i=n-2;i>=0 ;i-- ){
			if (i+qArr[i][0]<=n)															//이 일을 할 수 있다. 
				if (qArr[i][1]+aArr[i+qArr[i][0]]>aArr[i+1]){			//할 까 말까
					aArr[i]=qArr[i][1]+aArr[i+qArr[i][0]];
					continue;																	//for 처음으로
				}		
			aArr[i]=aArr[i+1];																//할 수 없거나, 손해면 하지 말자
		}
		System.out.println(aArr[0]);
	}
}