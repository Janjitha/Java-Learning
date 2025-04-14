class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        //total candies for both Alice and Bob
        int suma = 0, sumb = 0;
        for (int a : aliceSizes){
            suma += a; //3
        }
        for (int b : bobSizes){
            sumb += b; //5
        }
        // find diff by div 2 => if Bob has more => needs to give more candies than Alice
        int give = (sumb - suma) / 2; //0
        Set<Integer> bob = new HashSet<>();
        for (int b : bobSizes) {
            bob.add(b); //2,3
        }
        //the swap pair
        for (int a : aliceSizes) {
            int b = a + give; //1 2
            if (bob.contains(b)) { //1 not contains in 2,3
                return new int[]{a, b};
            }
        }
        return new int[]{}; // 1,2
    }
}