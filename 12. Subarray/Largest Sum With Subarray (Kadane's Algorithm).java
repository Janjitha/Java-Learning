import java.util.*;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-3, 7, -2, 3, 5, -2}; // example array
        int maxSum = Integer.MIN_VALUE;   // stores maximum sum
        int currentSum = 0;               // stores sum till current index

        int start = 0, end = 0, tempStart = 0; // to track subarray indices

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;   // update start of max subarray
                end = i;             // update end of max subarray
            }

            // if current sum becomes negative, reset it
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1; // next element might be new start
            }
        }

        // Output the results
        System.out.println("Maximum sum: " + maxSum);
        System.out.print("Largest sum subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
