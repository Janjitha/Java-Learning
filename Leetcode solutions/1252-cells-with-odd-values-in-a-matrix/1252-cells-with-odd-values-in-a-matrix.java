class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int a[][] = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            for (int j = 0; j < n; j++) {
                a[row][j]++;
            }
            for (int k = 0; k < m; k++) {
                a[k][col]++;
            }
        }
        int count = 0;
        for (int k = 0; k < m; k++) {
            for (int z = 0; z < n; z++) {
                if (a[k][z] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

/*
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int ans = 0;
        // rows[i] and cols[i] :=
        // true (flipped even times) / false (flipped odd times)
        boolean[] rows = new boolean[m]; // Fix: use m instead of n
        boolean[] cols = new boolean[n];

        for (int[] index : indices) {
            rows[index[0]] = rows[index[0]] ^ true;
            cols[index[1]] = cols[index[1]] ^ true;
        }

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (rows[i] ^ cols[j])
                    ++ans;

        return ans;
    }
}
*/
