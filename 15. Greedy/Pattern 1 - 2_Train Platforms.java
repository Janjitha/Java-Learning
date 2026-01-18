2: TRAIN PLATFORMS
/***
Problem:

Minimum platforms required so that no train waits.

Arrival:   900  940  950 1100 1500 1800
Departure: 910 1200 1120 1130 1900 2000

🧩 IDEA

Sort arrivals and departures separately.

Steps:

If next arrival ≤ earliest departure → need new platform

Else → free platform

💻 SIMPLE CODE LOGIC
Arrays.sort(arr);
Arrays.sort(dep);

int platforms = 1, max = 1;
int i = 1, j = 0;

while (i < n && j < n) {
    if (arr[i] <= dep[j]) {
        platforms++;
        max = Math.max(max, platforms);
        i++;
    } else {
        platforms--;
        j++;
    }
}

🧠 WHY END TIME MATTERS HERE

We always try to:

reuse the platform that frees earliest
***/
  ========================================================
  import java.util.*;

public class MinimumPlatforms {

    public static int findPlatforms(int[] arr, int[] dep) {
        int n = arr.length;

        // STEP 1: Sort arrival and departure times
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms = 1, maxPlatforms = 1;
        int i = 1, j = 0;

        // STEP 2: Greedy comparison
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platforms++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
                i++;
            } else {
                platforms--;
                j++;
            }
        }
        return maxPlatforms;
    }

    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(findPlatforms(arr, dep)); // Output: 3
    }
}


That’s finish-time greedy again.
