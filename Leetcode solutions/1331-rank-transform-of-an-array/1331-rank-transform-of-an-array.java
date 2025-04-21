class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a = arr.clone();
        Arrays.sort(a);
        //Map to store each unique number's rank
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        // Assign rank to each unique number
        for (int num : a) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        // Replace original values with their ranks
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }
        return arr;
    }
}
