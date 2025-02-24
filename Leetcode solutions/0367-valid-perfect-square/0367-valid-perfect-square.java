class Solution {
    public boolean isPerfectSquare(int num) {
        long first=1;
        long last=num;
        while(first<=last)
        {
            long mid=first+(last-first)/2;
            if(mid*mid==num)
            {
                return true;
            }
            else if(mid*mid>num)
            {
                last=mid-1;
            }
            else
            {
                first=mid+1;
            }
        }
        return false;
        
    }
}