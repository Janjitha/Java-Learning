class Solution {
    public String reverseWords(String s) {
        String k = "";
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            k += words[i];
            if (i != 0) {
                k += " ";
            }
        }
        return k;
    }
}
