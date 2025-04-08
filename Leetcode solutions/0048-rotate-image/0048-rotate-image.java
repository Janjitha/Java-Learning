class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}
// By using extra array
//         int r = matrix.length;
//         int c = matrix[0].length;
//         int a[][] = new int[r][c];
//         int ind = r-1;;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 a[j][ind]=matrix[i][j];
//             }
//             ind--;
//         }
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 matrix[i][j]=a[i][j];
//             }
//         }
//     }
// }
