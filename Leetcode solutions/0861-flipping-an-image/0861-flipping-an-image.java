class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int res[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            int a=0;
            for(int j=n-1;j>=0;j--)
            {
                res[i][a++]=image[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(res[i][j]==1)
                {
                    res[i][j]=0;
                }
                else if(res[i][j]==0)
                {
                    res[i][j]=1;
                }
            }
        }
        return res;

        
    }
}