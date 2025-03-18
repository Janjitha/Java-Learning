class Solution {
    public int maxAscendingSum(int[] nums) {
        int s=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i]>nums[i-1]){
                s+=nums[i];
                a=Math.max(a,s);
            }else{
                s=nums[i];
            }
        }
        return a;
    }
}

/*
class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = 0, currSum = nums[0];
        int n = nums.length;

        for(int i=1; i<n; i++){
            if(nums[i] > nums[i-1]){
                currSum += nums[i];
            }else{
                maxSum = Math.max(maxSum, currSum);
                currSum = nums[i];
            }
        }
        return Math.max(currSum, maxSum);
    }
}
*/
