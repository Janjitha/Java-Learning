class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count = 0;
        int s = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                i++;
            } else {
                s++;
            }
        }
        s = nums.length - (count * 2);
        return new int[]{count, s};
    }
}
