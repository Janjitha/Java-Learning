class Solution {
    public int minOperations(int[] nums, int k) {
        int mn = Integer.MAX_VALUE;
        for (int num : nums) {
            mn = Math.min(mn, num);
        }
        if (mn < k) {
            return -1;
        }
        boolean[] has = new boolean[101];
        for (int num : nums) {
            has[num] = true;
        }
        int cnt = 0;
        for (int i = 0; i < has.length; i++) {
            if (has[i] && i > k) {
                cnt++;
            }
        }
        return cnt;
    }
}


//         int count = 0;
//         int mn = Integer.MAX_VALUE;
//         boolean[] seen = new boolean[100001]; // Assuming nums contains only positive integers <= 100000
//         // Single pass: Find the minimum value and count unique elements
//         for (int num : nums) {
//             // Track minimum value
//             if (num < mn) {
//                 mn = num;
//             }
//             // Count unique elements using the boolean array
//             if (!seen[num]) {
//                 seen[num] = true;
//                 count++;
//             }
//         }
//         // If the minimum value is less than k, return -1
//         if (mn < k) {
//             return -1;
//         }
//         if (mn > k) {
//             return count;
//         }return count - 1;
//     }
// }
