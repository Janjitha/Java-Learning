class Solution {
    public boolean check(int[] nums) {
        final int n = nums.length;
        int rotate = 0;
        for (int i = 0; i < n; ++i){
            if (nums[i] > nums[(i + 1) % n] && ++rotate > 1)
            return false;
        }
    return true;
  }
}
