Minimum Meeting Rooms / Platforms / Resources
📌 Problem this code solves
Given intervals (start, end), find minimum number of rooms required so that no intervals overlap in the same room.
========================================================
Code 
import java.util.*;

public class MeetingRoomsPattern2 {

    public static int minRooms(int[][] meetings) {

        // 1️⃣ Sort meetings by START time
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        // 2️⃣ PriorityQueue to store END times (earliest end on top)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 3️⃣ Add first meeting's end time
        pq.add(meetings[0][1]);

        // 4️⃣ Process remaining meetings
        for (int i = 1; i < meetings.length; i++) {

            int currentStart = meetings[i][0];
            int earliestEnd = pq.peek();

            // If room is free, reuse it
            if (currentStart >= earliestEnd) {
                pq.poll();   // remove old meeting
            }

            // Assign room to current meeting
            pq.add(meetings[i][1]);
        }

        // 5️⃣ Number of rooms needed
        return pq.size();
    }

    // Driver code for testing
    public static void main(String[] args) {
        int[][] meetings = {
            {0, 30},
            {5, 10},
            {15, 20}
        };

        System.out.println(minRooms(meetings)); // Output: 2
    }
}
/***
🧠 REMEMBER THIS LOGIC (NOT THE CODE)
Pattern-2 Thinking:

Meetings start in time order

Always check which room ends earliest

Reuse it if possible

Else, take new room

🔑 5-LINE EXAM MEMORY CHEAT
Sort by start time
Min-heap stores end times
If start ≥ earliest end → reuse room
Else → new room
Heap size = answer
  ***/
