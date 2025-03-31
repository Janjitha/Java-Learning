class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int minVal = nums[0];
        int maxDiff = -1; 
        for (int i = 1; i < n; i++) {
            if (nums[i] > minVal) {
                maxDiff = Math.max(maxDiff, nums[i] - minVal);
            } else {
                minVal = nums[i]; // Update min value
            }
        }
        return maxDiff;
    }
}