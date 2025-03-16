class Solution {
    public boolean isBalanced(String num) {
        int l=0;
        int r=0;
        for(int i=0;i<num.length();i++){
         if(i%2==0) l+=num.charAt(i)-'0';
        else   r+=num.charAt(i)-'0';
        }
        return l==r;
    }
}