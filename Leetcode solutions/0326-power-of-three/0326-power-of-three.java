class Solution {
    public boolean isPowerOfThree(int n) {
         while (n > 1 && n % 3 == 0) {
            n=n/3;
        }
        return n == 1;
    }
}

/*
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }
        return true;
    }
}
*/
