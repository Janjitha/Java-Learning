class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix[0].length;
        int c = matrix.length;
        int k[][] = new int[r][c];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                k[j][i]=matrix[i][j];
            }
        }return k;
    }
}

/*
class Solution {
    public int[][] transpose(int[][] matrix) {
        int k[][] = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                k[j][i]=matrix[i][j];
            }
        }return k;
    }
}*/
