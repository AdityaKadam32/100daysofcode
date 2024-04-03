class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int r = 0; r< m; r++){
            for(int c =0; c< n; c++){
                if(word.charAt(0) == board[r][c]){
                   boolean found =   dfs(board, word, r, c, 0 );
                   if(found) return true;
                }
            }
        }
        return false;
        
    }
    public boolean dfs(char[][] board, String word,int r, int c, int wordIndex ){
        //base case
        if(wordIndex == word.length()){
            return true;

        }
        //out of bound cases
        int rows = board.length;
        int cols = board[0].length;

        if(r<0 || c<0 || r >= rows || c >=cols){
            return false;
        }
        // invalid cases
        if(board[r][c] == ' ' || board[r][c]!= word.charAt(wordIndex)){
            return false;
        }
        // mark as visited
        char ch = board[r][c];
        board[r][c] = ' ';
        //dfs calls
        
        if(dfs(board, word, r-1,  c, wordIndex+1 ) ||
        dfs(board, word, r,  c+1, wordIndex+1 ) || 
        dfs(board, word, r+1,  c, wordIndex+1 )||
        dfs(board, word, r,  c-1, wordIndex+1 )){
            return true;
        }
        //backtracking
        board[r][c] = ch;
        return false;

    }
} 
