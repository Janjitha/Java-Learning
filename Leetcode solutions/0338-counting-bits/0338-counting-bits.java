class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            String str=Integer.toBinaryString(i);
            ans[i]=count(str);
        }
        return ans;
        
        
    }
    int count(String s)
    {
        int d=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                d++;
            }
        }
        return d;
    }
}