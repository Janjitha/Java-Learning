class Solution {
    public int smallestNumber(int n) {
        int a =0;
        while(n>0){
            n=n/2;
            a++;
        }
        return (int)Math.pow(2,a)-1;
    }
}
