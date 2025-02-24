class Solution {
    int check(int n)
    {
        if(n==1)
        {
            return 1;
        }
        if(n<=0)
        {
            return 0;
        }
        if(n%2==0)
        {   
            int a=n/2;
            return check(a);
        }
        if(n%3==0)
        {   
            int b=n/3;
            return check(b);
        }
        if(n%5==0)
        {   
            int c=n/5;
            return check(c);
        }
        return 0;
    }
    public boolean isUgly(int n) {
        int ans=check(n);
        if(ans!=1)
        {
            return false;
        }
        return true; 
    }
}