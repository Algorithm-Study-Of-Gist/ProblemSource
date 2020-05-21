import java.util.*;

class Q6359
{
	public static void main(String[] args) 
	{
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] caseQ = new int[n];
		for (int i=0;i<n ;i++ )
			caseQ[i]=sc.nextInt();
		int ans;

		for (int i=0;i<n ;i++ )
		{
			ans=0;
			int[] room = new int [caseQ[i]];					//일단 방을 만들어준다. 초기값은 0(java)
			for (int j=0;j<caseQ[i] ;j++ )							//1로 나누고 /2로 나누고 ... 
				for (int k=0;k<caseQ[i] ;k++ )
					if ((k+1)%(j+1)==0)									//방이 나누어 떨어지면
						room[k] = (room[k]==0) ? 1 : 0	;		//0이면 1로 하고 1이면 0으로 하겠다

			for (int j=0;j<caseQ[i] ;j++ )
				if (room[j]==1)
					ans++;														//열린 문의 개수를 세어준다.
			System.out.println(ans);
		}
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a;
		for (int i=0;i<n ;i++ ){
			a=sc.nextInt();
			System.out.println((int)(Math.sqrt(a)));
		}
	}
}
