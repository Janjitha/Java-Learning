class Solution {
    public boolean isIsomorphic(String s, String t) {
        int a_s[]=new int[256];
        int a_t[]=new int[256];
        for(int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i);
            if(a_s[s1]==0 && a_t[t1]==0)
                a_s[s1]=t1;
                a_t[t1]=s1;
            if(a_s[s1]!=t1 || a_t[t1]!=s1)
                return false;
        }return true;
    }
}
