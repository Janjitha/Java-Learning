class Solution {
    public int[] numberOfPairs(int[] nums) {
        int f[]=new int[101];
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++){
            f[nums[i]]++;
        }
        for(int i=0;i<101;i++){
            a[0]+=(f[i]/2);
            a[1]+=(f[i]%2);
        }
        return a;
    }
}