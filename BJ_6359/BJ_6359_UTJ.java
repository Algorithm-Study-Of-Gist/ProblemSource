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
			int[] room = new int [caseQ[i]];					//�ϴ� ���� ������ش�. �ʱⰪ�� 0(java)
			for (int j=0;j<caseQ[i] ;j++ )							//1�� ������ /2�� ������ ... 
				for (int k=0;k<caseQ[i] ;k++ )
					if ((k+1)%(j+1)==0)									//���� ������ ��������
						room[k] = (room[k]==0) ? 1 : 0	;		//0�̸� 1�� �ϰ� 1�̸� 0���� �ϰڴ�

			for (int j=0;j<caseQ[i] ;j++ )
				if (room[j]==1)
					ans++;														//���� ���� ������ �����ش�.
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
