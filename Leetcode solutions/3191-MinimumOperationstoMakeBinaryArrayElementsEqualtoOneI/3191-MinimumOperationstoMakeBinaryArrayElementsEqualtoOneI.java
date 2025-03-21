class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=0;i<=nums.length-3;i++){
            if(nums[i]==0){
                for(int j=i;j<i+3;j++){
                    if(nums[j]==1){
                        nums[j]=0;
                    }
                    else{
                        nums[j]=1;
                    }       
                }
                c++;
            }   
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 1){
                count++;
            }
        }
        if(count==0){
            return c;
        }
        return -1;
    }
}


