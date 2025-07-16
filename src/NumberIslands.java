class NumberIslands {
    public static void main(String args[]){
         NumberIslands obj = new NumberIslands();
         char grid[][] = {{'1','1','1','1','0'},
                          {'1','1','0','1','0'},
                          {'1','1','0','0','0'},
                          {'0','0','0','0','0'}};
        System.out.println(obj.numIslands(grid));
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == '1'){
                  count++;
                  recursion(grid,i,j);
            }
        }
    }
        return count;
    }
    public void recursion(char grid[][], int i , int j){
        if(i<0 || i > grid.length || j<0 || j> grid[0].length || grid[i][j] == '0')
             return;
            
        grid[i][j] = '0';
        recursion(grid, i-1, j);
        recursion(grid, i+1, j);
        recursion(grid, i, j-1);
        recursion(grid, i, j+1);
    }
}