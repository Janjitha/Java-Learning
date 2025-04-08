class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            while(i<nums.length-1 && nums[i+1]==nums[i]+1){ //to check whether it continue 
                i++; // 0 - 2
            }
            if(n!=nums[i]){ //0!=2
                res.add(n+"->"+nums[i]);
            }
            else{
                res.add(n+"");
            }
        }
        return res;
    }
}