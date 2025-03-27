class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans = 0;
        int low = 0;
        int mid = 0;
        for (int num : nums) {
            if (num > right){
             mid = 0;
            }
            else{
             ans += ++mid;
            }
            if (num >= left) {
            low = 0;
            }
            else{ 
            ans -= ++low;
        }
        }
        return ans;
    }
}