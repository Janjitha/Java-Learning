class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSmall = 0, sumLarge = 0;
        for (int x : nums) {
            if (x < 10) {
                sumSmall += x;
            } else {
                sumLarge += x;
            }
        }
        return sumSmall != sumLarge; 
    }
}
