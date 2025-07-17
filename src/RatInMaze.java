public class RatInMaze{
    public static void main(String args[]){
        char grid[][]= {{'.','X','.','.','X'},{'.','X','.','.','.'},{'.','X','.','X','.'},{'.','X','.','X','.'},{'.','.','.','X','.'}};
        boolean used[][] = new boolean[grid.length][grid[0].length];
        recursion(grid,0,0,4,4,"",used);
    }
    public static void recursion(char grid[][], int row,int col, int dr, int dc, String ans,boolean used[][]){
        if(row > dr || col > dc || row < 0 || col < 0 || grid[row][col] == 'X' || used[row][col])
          return;
        if(row==dr && col == dc){
            System.out.println(ans);
            return;
        }
        used[row][col] = true;
        //left
        recursion(grid,row,col-1,dr,dc,ans+'L',used);

        //right
        recursion(grid,row,col+1,dr,dc,ans+'R',used);

        //up
        recursion(grid,row-1,col,dr,dc,ans+'U',used);

        //down
        recursion(grid,row+1,col,dr,dc,ans+'D',used);

        used[row][col] = false;
    }
}