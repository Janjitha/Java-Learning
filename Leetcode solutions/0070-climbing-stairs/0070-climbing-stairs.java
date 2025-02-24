class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=fibo(n,dp);
        return ans;
        
    }
    int fibo(int n,int dp[])
    {
        if(n==1)
        return 1;
        if(n==2)
        {
            return 2;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        else
        {
            dp[n]= fibo(n-1,dp)+fibo(n-2,dp);
            return dp[n];
        }
    }
}