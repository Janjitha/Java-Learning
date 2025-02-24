class Solution {
    public boolean isHappy(int n) {
        if(n==1)
        {
            return true;
        }
        if(n<=9 &&n%2==0)
        {
            return false;
        }
        int rem,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem*rem;
            n=n/10;
        }
        return isHappy(sum);
    
        
           
        
    }
}