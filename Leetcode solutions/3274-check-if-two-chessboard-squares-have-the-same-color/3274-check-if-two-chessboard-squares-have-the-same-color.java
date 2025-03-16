class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int a = coordinate1.charAt(0)+coordinate1.charAt(1);
        int b = coordinate2.charAt(0)+coordinate2.charAt(1);
        return (a+b)%2==0;
    }
}
