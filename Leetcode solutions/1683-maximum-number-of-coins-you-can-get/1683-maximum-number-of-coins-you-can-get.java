class Solution {
    public int maxCoins(int[] piles) {
        int n=piles.length;
        Arrays.sort(piles);
        int a=n/3;
        int ans=0;
        for(int i=a;i<n;i=i+2)
        {
           ans=ans+piles[i];
        }
        return ans;
        
    }
}