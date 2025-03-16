class Solution {
    public boolean isHappy(int n) {
     while(n!=1 && n!=4){
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=r*r;
            n/=10;
        }n=sum;
    }return n==1;
  }
}
