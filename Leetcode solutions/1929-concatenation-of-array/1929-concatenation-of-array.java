class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] k = new int[n * 2]; 
        System.arraycopy(nums, 0, k, 0, n);//copy first half
        //System.arraycopy(source, startIndex, destination, destinationStartIndex, length)
        System.arraycopy(nums, 0, k, n, n);//Copy second half 
        return k; // Return the concatenated array
    }
}
/*
        int n = nums.length;
        int k[] = new int[n*2];
        for(int i=0;i<n;i++){
            k[i]=nums[i];
            k[i+n]=nums[i]; 
        }
        return k;
    }
}
*/
