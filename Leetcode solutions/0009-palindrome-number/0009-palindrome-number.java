class Solution {
    public boolean isPalindrome(int x) {
        while(x<0){
            return false;
        }
        int xcopy = x;
        int digit=0;
        while (x>0){
            int rem = x % 10;
            digit=digit*10+rem;
            x=x/10;
        }
        return digit ==  xcopy;
    }
}

