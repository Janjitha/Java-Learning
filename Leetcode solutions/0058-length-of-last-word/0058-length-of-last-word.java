class Solution {
    public int lengthOfLastWord(String s) {
       String str = s.trim();
       int count=0;
       char ch[]=str.toCharArray();
       for(int i=ch.length-1;i>=0;i--){
        if(ch[i]!=' '){
            count++;
        }
        else{
            break;
        }
       }return count;
    }
}
====================================================================================
class Solution {
    public int lengthOfLastWord(String s) {
        String[] a=s.split(" ");
        String len = a[a.length-1];
        return len.length();
    }
}
