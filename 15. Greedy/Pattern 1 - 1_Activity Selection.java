1: ACTIVITY SELECTION
/***
Problem:

You have activities with start and end times.
You can do only one at a time.
Maximize number of activities.

Input:
Start:  [1, 3, 0, 5, 8, 5]
End:    [2, 4, 6, 7, 9, 9]

❌ WRONG THINKING (COMMON MISTAKE)

Pick activity with earliest start ❌
Pick longest activity ❌

These block future choices.

✅ CORRECT GREEDY THINKING

“Let me finish fast so I can do more later.”

🧩 STEP-BY-STEP SOLUTION
Step 1: Sort by END time
(1,2), (3,4), (0,6), (5,7), (8,9), (5,9)

Step 2: Pick first activity
(1,2)

Step 3: Pick next activity whose start ≥ last end
(3,4)
(5,7)
(8,9)

✅ Answer = 4 activities
🧠 WHY THIS WORKS (INTUITION)

Ending early leaves more empty space

Any activity ending later blocks future ones

Earliest finish is always a safe choice

That’s why this greedy is correct.
***/
================================================================
import java.util.*;
class Activity{
    int start,end;
    Activity(int s,int e){
        start = s;
        end = e;
    }
}
class Main {
    public static int maxA(int[] start,int[] end){
        int n = start.length;
        Activity arr[] = new Activity[n];
        for(int i=0;i<n;i++){
            arr[i]=new Activity(start[i],end[i]);
        }
        Arrays.sort(arr,(a,b) -> a.end-b.end);
        int count=0;
        int lastEnd = arr[0].end;
        for(int i=1;i<n;i++){
            if(arr[i].start>=lastEnd){
                count++;
                lastEnd = arr[i].end;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 10};
        int[] end   = {2, 4, 6, 7, 9, 15};
        System.out.println(maxA(start,end));
    }

}

