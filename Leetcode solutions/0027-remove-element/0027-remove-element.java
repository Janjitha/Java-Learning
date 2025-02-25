class Solution {
    public int removeElement(int[] nums, int val) {
        int index= 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i]; 
                index++;
            }
        }
        return index ; 
    }
}

=======================================================================================================

class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=val)
            {
                nums[count++]=nums[i];
            }
        }
        return count;
        
    }
}
