class Solution {
    public int[] runningSum(int[] nums) {
        int k[] = new int[nums.length];
        k[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            k[i] = k[i - 1] + nums[i];
        }
        return k;
    }
}
