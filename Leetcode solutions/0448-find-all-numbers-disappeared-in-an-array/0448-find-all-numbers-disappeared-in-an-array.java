class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        while(i < n){
            if (nums[i] != 0){
               if(nums[nums[i] - 1] == 0){
                i++;
               }
               else{
                  int temp = nums[i];
                  nums[i] = nums[temp - 1];
                  nums[temp-1] = 0;    
               }
            }
            else{
                i++;
            }
        }
        for(int j = 0 ; j < n ; j++){
            if(nums[j] != 0){
                res.add(j+1);
            }
        }
        return res;
        }
    }
