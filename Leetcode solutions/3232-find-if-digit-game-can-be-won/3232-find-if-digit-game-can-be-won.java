class Solution {
    public boolean canAliceWin(int[] nums) {
        int lessthanten = 0, greaterthanten = 0;

        for(int i : nums){
            if (i > 9){
                greaterthanten += i;
            }
            else{
                lessthanten += i;
            }
        }
    return lessthanten == greaterthanten ? false : true; 
    }
}