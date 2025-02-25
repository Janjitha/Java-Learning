class Solution {
public:
    bool isPalindrome(int x) {
       while(x<0){
            return false;
        }
        int xcopy = x;
        long digit=0;
        while (x>0){
            long rem = x % 10;
            digit=digit*10+rem;
            x=x/10;
        }
        return digit ==  xcopy;
    }
};

  
