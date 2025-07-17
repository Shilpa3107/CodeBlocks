class Sudoku {
    public static void main(String args[]){
       char[][] board = {
    {'5','3','.','.','7','.','.','.','.'},
    {'6','.','.','1','9','5','.','.','.'},
    {'.','9','8','.','.','.','.','6','.'},
    {'8','.','.','.','6','.','.','.','3'},
    {'4','.','.','8','.','3','.','.','1'},
    {'7','.','.','.','2','.','.','.','6'},
    {'.','6','.','.','.','.','2','8','.'},
    {'.','.','.','4','1','9','.','.','5'},
    {'.','.','.','.','8','.','.','7','9'}
};

    Sudoku obj = new Sudoku();
    obj.solveSudoku(board);

    }
    public void solveSudoku(char[][] board) {
       fill(board,0,0);

    }
    public void fill(char board[][], int row, int col){
        if(col == 9){
            row++;
            col = 0;
        }
        if(row == 9){
            print(board);
            return;
        }
        if(board[row][col] != '.')
            fill(board,row,col+1);
        else{
            for(int i = 1;i<=9;i++){
                if(isSafe(board,row,col,i)){
                   board[row][col] = (char)((int)('0'+i));
                   fill(board,row,col+1);
                   board[row][col] = '.';
                }
            }
        }
    }
    public void print(char board[][]){
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public boolean isSafe(char board[][], int row, int col, int val){
        char ch = (char)(val+(int)'0');
        // int c = col;
        // while(c < board[0].length){
        //     if(board[row][c] == ch)
        //       return false;
        //     c++;
        // }
        // c = col;
        // while(c >= 0){
        //     if(board[row][c] == ch)
        //       return false;
        //     c--;
        // }
        // int r = row;
        // while(r < board.length){
        //     if(board[r][col] == ch)
        //        return false;
        //     r++;
        // }
        // r = row;
        // while(r >= 0){
        //     if(board[r][col] == ch)
        //       return false;
        //     r--;
        // }
        //block

        //row wise
        for(int i = 0;i<9;i++){
            if(board[row][i] == ch)
              return false;
        }

        //column wise
        for(int i = 0;i<9;i++){
            if(board[i][col] == ch)
               return false;
        }

        //grid
        row = row-(row%3);
        col = col-(col%3);
        for(int i = row;i<row+3;i++){
            for(int j = col;j<col+3;j++){
                if(board[i][j] == ch)
                  return false;
            }
        }

        return true;
    }
}