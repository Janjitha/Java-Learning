class Solution {
    public int reverse(int x) {
         int rev=0;
         boolean neg=false;
        if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE)
        {
            return 0;
        }
        if (x < 0) {
            x = -x;
            neg = true;
        }
        while(x!=0){
             int rem=x%10;
             if (rev > (Integer.MAX_VALUE - rem) / 10) return 0;
            rev=(rev*10)+rem;
            x=x/10;  
        }
        if(neg)
        {
            return -rev;
        }
        return rev;  
    }
}