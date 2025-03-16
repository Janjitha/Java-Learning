class Solution {
    public boolean isUgly(int n) {
       for(int a=2;a<6 && n>0;a++){
           while(n%a==0){
               n/=a;
           }
       } 
       return n==1;
    }
}
