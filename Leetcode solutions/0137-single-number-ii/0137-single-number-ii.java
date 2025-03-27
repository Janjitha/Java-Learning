class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones ^= num;   
            ones &= ~twos; 

            twos ^= num;   
            twos &= ~ones; 
        }
        return ones;  
    }
}

