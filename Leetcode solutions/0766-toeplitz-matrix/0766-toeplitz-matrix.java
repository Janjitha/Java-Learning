class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(!toeplitz(0, 0, matrix)) return false;
        for(int i = 0; i < matrix.length; i++){
            if(!toeplitz(i, 0, matrix)) return false;
        }
        for(int j = 0; j < matrix[0].length; j++){
            if(!toeplitz(0, j, matrix)) return false;
        }
        return true;
    }
    
    private boolean toeplitz(int i, int j, int[][] matrix){
        while(i+1 < matrix.length && j+1 < matrix[0].length){
            if(matrix[i+1][j+1] != matrix[i++][j++]) return false;
        }
        return true;
    }
}