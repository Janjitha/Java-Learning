class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row=image[0].length;
        int col = image[0].length;
        int a[][] = new int[row][col];
        int r=0,c=0;
        for(int i=0;i<row;i++){
            for(int j=col-1;j>=0;j--){
                if(image[i][j]==1 && c<image[i].length){
                    a[r][c]=0;
                    c++;
                }else if(image[i][j]==0 && c<image[i].length){
                    a[r][c]=1;
                    c++;
                }
            }
            c=0;
            r++;
        }
        return a;
    }
}
