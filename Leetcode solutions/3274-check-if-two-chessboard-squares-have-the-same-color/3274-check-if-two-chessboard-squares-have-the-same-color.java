class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        boolean c1 = (coordinate1.charAt(0) + coordinate1.charAt(1)) % 2 != 0;
        boolean c2 = (coordinate2.charAt(0) + coordinate2.charAt(1)) % 2 != 0;
        return c1 == c2;
    }
}