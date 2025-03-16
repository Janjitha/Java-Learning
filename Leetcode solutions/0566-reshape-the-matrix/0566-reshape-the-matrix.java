class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int x=mat.length;
        int y=mat[0].length;
        if(x*y!=r*c) return mat;
        int a[][] = new int[r][c];
        int row=0,col=0,index=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                // if(col==c){
                //     col=0;
                //     row++;
                // }
                // a[row][col]= mat[i][j];
                // col++;
                a[index/c][index%c]=mat[i][j];
                index++;
            }
        }
        return a;
    }
}

/*
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if(m*n!=r*c)
        {
            return mat;
        }
        int ans[][]=new int[r][c];
        for(int i=0;i<m*n;i++)
        {
            ans[i/c][i%c]=mat[i/m][i%m];
        }
        return ans;        
    }
}
*/
