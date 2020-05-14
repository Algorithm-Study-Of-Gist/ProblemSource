import java.util.*;

class Q2011
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int n_c=n;
		int digit=0;									//n이 몇자리 수 인지
		while(n_c>0){
			n_c/=10;
			digit++;
		}
		int[] arrN = new int [digit];		// 25114를 받으면 2/5/1/1/4로 만들어주는 배열
		for (int i=0;i<digit ;i++ ){
			n_c=n;
			for (int j=0;j<i ;j++ )
				n_c/=10;
			arrN[i]=n_c%10;
		}

		if (arrN[digit-1]==0){
			System.out.println(0);
			return;
		}
		for (int i=0;i<digit-1 ;i++ )
			if (arrN[i]==0 )
				if(arrN[i+1]!=1 && arrN[i+1]!=2){
					System.out.println(0);
					return;
				}

		long[] arrA = new long[digit+1];
		arrA[0]=1; arrA[1]=1;

		if (digit>1)
			for (int i=2;i<digit+1 ;i++ ){
				if (arrN[i-2]==0)
					arrA[i] = arrA[i-2]%1000000;
				else{
					arrA[i] = arrA[i-1]%1000000;
					if(arrN[i-1]*10+arrN[i-2]<27)
						arrA[i]+=arrA[i-2]%1000000;
				}
			}
		
		System.out.println(arrA[digit]%1000000);
	}
}
