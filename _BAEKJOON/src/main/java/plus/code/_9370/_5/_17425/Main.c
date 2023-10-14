#include <stdio.h>
#define MAX 1000000
int main(){
    long long int dp[MAX+1] = {0};

    for(int i=1;i<=MAX;i++){
        for(int j=1;i*j<=MAX;j++){
            dp[i*j]+=i;
        }
        dp[i] += dp[i-1];
    }

    int T,N;
    scanf("%d",&T);
    for(int i=0;i<T;i++)
    {
        scanf("%d",&N);
        printf("%lld\n",dp[N]);
    }
}