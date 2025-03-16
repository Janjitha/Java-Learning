class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        String k = "";
        int i = 0, j = 0;
        while (i < n || j < m) {
            if (i < n) {
                k += word1.charAt(i);
                i++;
            }
            if (j < m) {
                k += word2.charAt(j);
                j++;
            }
        }
        return k;
    }
}
