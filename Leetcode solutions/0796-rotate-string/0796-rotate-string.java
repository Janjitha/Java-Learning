class Solution {
    public boolean rotateString(String s, String goal) {
        int N = s.length();
        if (N != goal.length()) {
            return false;
        }
        String concatenated = s + s;
        return concatenated.contains(goal);
    }
}