class Solution {
    public int[] sortedSquares(int[] nums) {
        int k[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            k[i]=nums[i]*nums[i];
        }
        Arrays.sort(k);
        return k;
        }
    }
