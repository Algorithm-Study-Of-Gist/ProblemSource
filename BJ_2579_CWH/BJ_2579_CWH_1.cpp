#include <stdio.h>
int func(int gaedan[], int where){
    if(where<0)
        return 0;
    else if(where==1)
        return gaedan[1]+gaedan[0];
    else if(where==0)
        return gaedan[0];
    else{
        if(func(gaedan, where-2)>func(gaedan, where-3)+gaedan[where-1])
            return func(gaedan, where-2)+gaedan[where];
        else
            return func(gaedan, where-3)+gaedan[where-1]+gaedan[where];
    }
}
int main(void){
    int N, gaedan[301]={};
    scanf("%d",&N);
    for(int i=0; i<N; i++){
        scanf(" %d", &gaedan[i]);
    }
    printf("%d",func(gaedan, N-1));
}

