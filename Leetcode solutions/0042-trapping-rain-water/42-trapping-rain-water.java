class Solution {
    //efficient solution
    public int trap(int[] height) {
        if (height.length == 0)
            return 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0, rightMax = 0, total = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] <= leftMax) {
                    total += leftMax - height[left];
                } else {
                    leftMax = height[left];
                }
                left++;
            } 
            else {
                if (height[right] <= rightMax) {
                    total += rightMax - height[right];
                } else {
                    rightMax = height[right];
                }
                right--;
            }
        }
        return total;
    }
}

/*
class Solution {
    public int trap(int[] height) {
        if (height.length == 0)
            return 0;
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int max = 0, volume = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, height[i]);
            leftMax[i] = max;
        }
        max = 0;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            rightMax[i] = max;
        }
        for (int i = 0; i < n; i++) {
            volume += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return volume;
    }
}
*/

/*
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n<3) return 0;
        int[] right = new int[n];
        int rightMax = 0;
        for(int i = 0;i<n;i++){
            right[n - i - 1]  = rightMax;
            rightMax = Math.max(height[n- i - 1],rightMax);
        }
        int res = 0;
        int leftMax = 0;
        for(int i = 0;i<n;i++){
            int minHeight = Math.min(leftMax,right[i]);
            if(minHeight>height[i]) res+=(minHeight-height[i]);
            leftMax = Math.max(leftMax,height[i]);
        }
        return res;
    }
}
*/
