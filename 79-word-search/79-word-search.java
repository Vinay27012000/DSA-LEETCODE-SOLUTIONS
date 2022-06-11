class Solution {
    boolean ans;
    public boolean exist(char[][] board, String word) {
        char[] arr = word.toCharArray();
        //Start at index 0
        ans = false;
        //Calling recursively from each index where char at that index is first letter
        //Then from those index search for other chars neighbouring to it.
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==arr[0]){
                    //Call the function
                    func(board,arr,1,i,j);
                    if(ans)return true;
                }
            }
        }
        return ans;
    }
    public void func(char[][] board,char[] arr,int index,int i,int j){
        //Base case
        if(index==arr.length){
            ans = true;
            return;
        }
        //Method
        //Mark this place as visited
        char temp = board[i][j];
        board[i][j]='1';
        //Check for surrounding for arr[index]... if found go to that position and repeat procedure.
        if(i-1>=0){
            if(board[i-1][j]==arr[index]){
                func(board,arr,index+1,i-1,j);
            }
        }
        if(j-1>=0){
            if(board[i][j-1]==arr[index]){
                func(board,arr,index+1,i,j-1);
            }
        }
        if(i+1<board.length){
            if(board[i+1][j]==arr[index]){
                func(board,arr,index+1,i+1,j);
            }
        }
        if(j+1<board[0].length){
            if(board[i][j+1]==arr[index]){
                func(board,arr,index+1,i,j+1);
            }
        }
        //Unmark this block again
        board[i][j]=temp;
        return;
    }
}
