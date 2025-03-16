class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        
        String strSum;
        for(int i=0; i<nums.length;i++){
            strSum = Integer.toString(nums[i]);
            
            if(strSum.length()%2==0){
                count++;
            }
            
        }
        return count;
    }
}