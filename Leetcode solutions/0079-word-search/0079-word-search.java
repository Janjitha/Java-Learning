class Solution {
    public boolean exist(char[][] b, String word) 
    {
        for(int r = 0 ; r < b.length ; r++)
            for(int c = 0 ; c < b[0].length ; c++)
                if(b[r][c] == word.charAt(0) && help(b,word,0,r,c))
                    return true;
        return false;
    }    
    public boolean help(char[][] b, String word, int start, int r, int c)
    {
        if(word.length() <= start)
            return true;        
        if(r < 0 || c < 0 || r >= b.length || c >= b[0].length || 
        b[r][c] == '0' || b[r][c] != word.charAt(start))
            return false;       
        char tmp = b[r][c];
        b[r][c] = '0';
        if(help(b,word,start+1,r+1,c) || help(b,word,start+1,r-1,c) || help(b,word,start+1,r,c+1) || help(b,word,start+1,r,c-1))
            return true;      
        b[r][c] = tmp;
        return false;
    }
}

/*
class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == word.charAt(0) && help(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean help(char[][] board, int i, int j, String word, int len){
        if(len == word.length()){
            return true;
        }
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length){
            return false;
        }
        if(board[i][j] != word.charAt(len)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '*';

        boolean found = help(board, i-1, j, word, len+1) || 
                        help(board, i+1, j, word, len+1) ||
                        help(board, i, j-1, word, len+1) ||
                        help(board, i, j+1, word, len+1);

        board[i][j] = temp;
        return found;
    }
}
*/
