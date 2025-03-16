class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int sum = 0;
        int sum1 = 0;
        int total;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && i + j != n - 1) {
                    sum = sum + mat[i][j];
                }
                if (i + j == n - 1) {
                    sum1 = sum1 + mat[i][j];
                }
            }
        }
        total = sum + sum1;
        return total;
    }
}

/*
class Solution {
    public int diagonalSum(int[][] mat) {
        int matLen = mat.length;
        int ans = 0;
        for(int i=0; i<matLen/2; i++){
            ans += mat[i][i] + mat[i][matLen-1-i] + mat[matLen-1-i][i] + mat[matLen-1-i][matLen-1-i];
        }        
        if(matLen%2 != 0)
            ans += mat[matLen/2][matLen/2];        
        return ans;
    }
}
*/
