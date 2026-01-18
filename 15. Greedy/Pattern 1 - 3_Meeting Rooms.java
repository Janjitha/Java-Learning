3: MEETING ROOMS
/***
Meetings:

[0,30], [5,10], [15,20]


Sorted by start:

Track earliest ending meeting using min-heap

🧠 KEY RULE TO MEMORIZE (VERY IMPORTANT)

When tasks overlap, the one that finishes earliest is safest

🧠 EXAM TRICK (USE THIS SENTENCE)

In your mind say:

“If I finish early, I get more choices later.”

If this sentence fits → use Pattern 1
  ***/
===============================================================
  import java.util.*;

public class MeetingRooms {

    public static int minRooms(int[][] meetings) {

        // STEP 1: Sort meetings by start time
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        // STEP 2: Min heap to track earliest ending meeting
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(meetings[0][1]);

        for (int i = 1; i < meetings.length; i++) {
            // If room is free, reuse it
            if (meetings[i][0] >= pq.peek()) {
                pq.poll();
            }
            pq.add(meetings[i][1]);
        }

        return pq.size();
    }

    public static void main(String[] args) {
        int[][] meetings = {
            {0, 30},
            {5, 10},
            {15, 20}
        };

        System.out.println(minRooms(meetings)); // Output: 2
    }
}
