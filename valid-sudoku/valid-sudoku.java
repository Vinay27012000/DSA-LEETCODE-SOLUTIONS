class Solution {
    public  boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == '.') continue;
                
                for(int z = i/3*3 ; z < i/3*3+3 ; z++){
                    
                     for(int y = j/3*3 ; y < j/3*3+3 ; y++){
                    
                         if(board[z][y] == board[i][j] && z!=i && y!=j) return false;
                    
                    }

                }

                for (int k = j+1; k < board.length; k++) {

                    if (board[i][j] == board[i][k] ) return false;
                }

                for (int k = i+1; k < board.length; k++) {

                    if (board[i][j] == board[k][j]) return false;
                }


            }
        }

        return true;
    }
}
