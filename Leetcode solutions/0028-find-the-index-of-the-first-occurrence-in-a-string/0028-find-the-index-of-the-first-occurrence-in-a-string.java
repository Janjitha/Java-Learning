class Solution {
    public int strStr(String haystack, String needle) {
      int m = haystack.length();
      int n = needle.length();
      int j;
      for (int i = 0; i <= m - n; i++) {
        for (j = 0; j < n; j++) {
            if (haystack.charAt(i + j) != needle.charAt(j)) 
            break;
        }
            if (j == n) return i;
        }
        return -1;
    }
}

/*
class Solution {
    public int strStr(String haystack, String needle) {
      return haystack.indexOf(needle);
    }
}
*/

/*
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) return -1;
        if(needle.length()==haystack.length()) return needle.equals(haystack) ? 0 : -1;
        int curr = 0;
        int size = needle.length();
        int terminalIndex = curr+size;
        while(terminalIndex!=haystack.length()+1){
            if(haystack.substring(curr,terminalIndex).equals(needle)) return curr;
            curr++;
            terminalIndex++;
        }
        return -1;
    }
}
*/
