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

		int[] aArr = new int [n+1];													//��ĭ  �� ����. ������ ĭ�� 0: �ʱⰪ
		if (qArr[n-1][0]==1)
			aArr[n-1]=qArr[n-1][1];													//�ʱⰪ

		for (int i=n-2;i>=0 ;i-- ){
			if (i+qArr[i][0]<=n)															//�� ���� �� �� �ִ�. 
				if (qArr[i][1]+aArr[i+qArr[i][0]]>aArr[i+1]){			//�� �� ����
					aArr[i]=qArr[i][1]+aArr[i+qArr[i][0]];
					continue;																	//for ó������
				}		
			aArr[i]=aArr[i+1];																//�� �� ���ų�, ���ظ� ���� ����
		}
		System.out.println(aArr[0]);
	}
}