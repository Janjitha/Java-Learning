class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false; // Quick check
        int i = 0;
        int j = 0;
        while (j < t.length() && i < s.length()) {
            if (s.charAt(i) == t.charAt(j)) 
            i++; 
            j++;
            
        }
        return i == s.length();
    }
}

/*
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int n1 = s.length();
        int n2 = t.length();

        while(i<n1 && j<n2){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i == n1;
    }
}
*/
