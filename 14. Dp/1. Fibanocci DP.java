import java.util.*;
class Main {
    static int fun(int n,int dp[]){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fun(n-1,dp)+fun(n-2,dp);
    }
    public static void main(String[] args) {
        int n = 6;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.print(fun(n,dp));
    }

}
