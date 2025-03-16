class Solution {
    public int differenceOfSums(int n, int m) {
        int n1=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                n1-=i;
            }else{
                n1+=i;
            }
        }return n1;
    }
}
