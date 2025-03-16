class Solution {
    public int[] runningSum(int[] nums) {
        int k[] = new int[nums.length];
        k[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            k[i] = k[i - 1] + nums[i];
        }
        return k;
    }
}

/*
class Solution {
     public int numJewelsInStones(String jewels, String stones) {
         List<Character>al =new ArrayList<>();
         int count=0;
     for(char jewel :jewels.toCharArray()){
         al.add(jewel);      
     }
         for(char stone:stones.toCharArray()){
             if(al.contains(stone)){
                 count++;
             }
         }
         return count;
     }
 }
*/
