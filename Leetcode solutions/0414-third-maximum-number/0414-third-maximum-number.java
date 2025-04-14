class Solution {
    public int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;
        for (int num : nums) {
            long n = (long) num;
            if ((first != null && n == first) || (second != null && n == second) || (third != null && n == third)){
                continue; //skip if the number checked 
            }
            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if (second == null || n > second) {
                third = second;
                second = n;
            } else if (third == null || n > third) {
                third = n;
            }
        }
        return third == null ? first.intValue() : third.intValue(); //no third return max
    }
}

//         int n = nums.length;
//         int max = 1;
//         Arrays.sort(nums);
//         for (int i = n - 1; i >= 1; i--) {
//             if (nums[i] != nums[i - 1]) 
//                 max++;
//             if (max == 3)
//                 return nums[i - 1];
//         }
//         return nums[n - 1];
//     }
// }