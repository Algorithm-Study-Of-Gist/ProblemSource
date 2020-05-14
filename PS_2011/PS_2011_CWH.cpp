#include <cstdio>
int main(void){
   int N[5010]={},dp[5010]={1,1,}, Ncnt=0, cnt=0, t;
   bool error=false;
   while(1){
      int a;
      a=getchar();//char로 받아 int로 리턴하므로 1이 49가 댐 
      if(a==EOF||a=='\n')   break;
      N[Ncnt]=a-48;//그래서 48빼주는거 
      Ncnt++; 
   }//암호를 입력받음
   for(int i=0; i<Ncnt; i++){
      if(i==0){
         if(N[i]==0)   error=true;
     }
     else{
        t=N[i-1]*10+N[i];
        if(t==0){
         error=true;
         break;
         }
      else if(t>=1 && t<=9)   dp[i]=dp[i-1];
      else if(t==10 || t==20){      
         if(i==1) dp[i]=1;
         else   dp[i]=dp[i-2];
      }
      else if(t>=10 && t<=26){
         if(i==1)   dp[i]=2;
         else dp[i]=dp[i-1]+dp[i-2];
      }
      else if(t%10==0){
         error=true;
         break;
         }
      else   dp[i]=dp[i-1];
        }
        dp[i]=dp[i]%1000000;
      }
   if(error)   printf("0");
   else   printf("%d",dp[Ncnt-1]);
}

