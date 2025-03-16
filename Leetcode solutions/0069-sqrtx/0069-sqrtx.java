class Solution {
    public int mySqrt(int x) {
        int res = (int)Math.pow(x,0.5);
        return res;
        //int res = (int)Math.sqrt(x);
        //return res;
    }
}

/*
class Solution {
    public int mySqrt(int x) {
        while(x>0){
            return (int)Math.pow(x,0.5);
        }return 0;
    }
}
*/
