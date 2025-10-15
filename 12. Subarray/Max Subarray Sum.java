int[] arr = {-3, 7, -2, 3, 5, -2};
int maxSum = arr[0], currSum = arr[0];
for(int i = 1; i < arr.length; i++){
    currSum = Math.max(arr[i], currSum + arr[i]);
    maxSum = Math.max(maxSum, currSum);
}
System.out.println("Max subarray sum: " + maxSum);
