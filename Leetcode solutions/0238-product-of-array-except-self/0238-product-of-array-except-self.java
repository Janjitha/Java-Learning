class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        //Fill result with 1 initially
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }
        int left = 1;
        for (int i = 0; i < n; i++) {
            result[i] *= left;   // Multiply stored left product
            left *= nums[i];     // Update left product 
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;  // Multiply stored right product
            right *= nums[i];    // Update right product
        }
        return result;
    }
}

//         int n = nums.length;
//         int[] result = new int[n];
//         // Fill result array with left product
//         result[0] = 1;
//         for (int i = 1; i < n; i++) {
//             result[i] = result[i - 1] * nums[i - 1];
//         }
//         // Multiply with right product in the same loop
//         int right = 1;
//         for (int i = n - 1; i >= 0; i--) {
//             result[i] *= right;  
//             right *= nums[i];    
//         }
//         return result;
//     }
// }

//         int i = nums.length;  
//         int j = nums.length;  
//         int[] result = new int[i]; 
//         //Compute left products (prefix)
//         int l = 1;
//         for (i = 0; i < nums.length; i++) {
//             result[i] =l ;
//             l*= nums[i];
//         }
//         //Compute right products (suffix) and update result
//         int r = 1;
//         for (j = nums.length - 1; j >= 0; j--) {
//             result[j] *= r;
//             r*= nums[j];
//         }
//         return result;
//     }
// }

/*
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        ans[0] = 1;

        for(int i=1; i<n; i++){
            ans[i] = ans[i-1]*nums[i-1];
        }

        int r = 1;

        for(int i=n-1; i>=0; i--){
            ans[i] *= r;
            r *= nums[i];
        }
        return ans;
    }
}
*/
