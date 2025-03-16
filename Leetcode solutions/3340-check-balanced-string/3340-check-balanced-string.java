class Solution {
    public boolean isBalanced(String num) {
        int s1=0,s2=0;
        for(int i=0;i<num.length();i++){
            int d = num.charAt(i)-'0';
            if(i%2==0){
                s1+=d;
            }else{
                s2+=d;
            }
        }//System.out.print(s1+" "+s2);
        return s1==s2;
    }
}
