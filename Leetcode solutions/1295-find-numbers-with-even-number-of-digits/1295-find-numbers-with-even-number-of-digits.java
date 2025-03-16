class Solution {
    public int findNumbers(int[] nums) {
        int total=0;
		for(int i=0;i<nums.length;i++) {
			int count=0;
			while(nums[i]>0) {
				int rem=nums[i]%10;
				count++;
				nums[i]/=10;
			}
			if(count%2==0) {
				total++;
			}
		}return total;
    }
}
