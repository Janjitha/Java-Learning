class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;  //to find missing take one element extra
        int expected = n*(n+1)/2;
        int actual = 0;
        for(int s : nums){
            actual+=s;
        }
        int ans = expected - actual;
        return ans;
    }
}

/*
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) 
        sum -= num;
        return sum;
    }
}
*/
