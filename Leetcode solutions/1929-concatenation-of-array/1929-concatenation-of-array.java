class Solution {
    public int[] getConcatenation(int[] nums) {
        final int n = nums.length;
        int k[] = new int[n*2];
        for(int i=0;i<n;i++){
            k[i]=k[i+n];
            k[i]=nums[i];
        }
        return k;
    }
}
