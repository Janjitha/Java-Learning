class Solution {
    public int searchInsert(int[] nums, int target) {
        int key=target;
        int low=0;
        int high=nums.length-1;
        int ans=binary(nums,low,high,key);
        return ans;
        
        
    }
    int binary(int nums[],int low,int high,int key)
    {
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==key)
            {
                return mid;
            }
            else if(nums[mid]>key)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            
        }
        return low;
    }
}