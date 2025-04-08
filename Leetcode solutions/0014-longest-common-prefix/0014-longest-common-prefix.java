class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);      
        String s1 = strs[0]; 
        String s2 = strs[strs.length - 1]; 
        String s = ""; 
        int ind = 0; 
        while (ind < s1.length() && ind < s2.length()) { 
            if (s1.charAt(ind) == s2.charAt(ind)) {
                s += s1.charAt(ind); // Add matching character
                ind++;
            } else {
                break; // Stop when characters do not match
            }
        }      
        return s; // Return the longest common prefix
    }
}