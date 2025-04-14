class Solution {
    public int repeatedNTimes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1; 
    }
}

//         int m = 0 ;
//         for(int i=0;i<nums.length;i++){
//             int c=0;
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     c++;
//                 }
//             }
//             if(c>m){
//                 m=nums[i];
//             }
//         }
//         return m;
//     }
// }