class Solution 
{
    public String findValidPair(String s) 
    {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each digit
        for (char c : s.toCharArray()) 
        {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Traverse and find the first valid adjacent pair
        for (int i = 0; i < s.length() - 1; i++) 
        {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);

            if (first != second && 
                freqMap.get(first) == first - '0' && 
                freqMap.get(second) == second - '0') {
                return "" + first + second; // Found a valid pair
            }
        }

        return ""; // No valid pair found
    }
}
