class Solution {
    public int singleNumber(int[] nums) {
        int c = 0;
        for(int n:nums){
            c=c^n;
        }
        return c;
    }
}

/*
class Solution {
    public int singleNumber(int[] nums) {
        int single=0;
        int i=0;
        while(i<nums.length){
            single^=nums[i];
            i++;
        }
        return single;
    }
}
*/

/*
class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;           
                }
            }
            if(count==1)
            {
            return nums[i];
            }            
        }        
       return 0; 
    }
}
*/
