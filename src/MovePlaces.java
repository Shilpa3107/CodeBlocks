public class MovePlaces{
    public static void main(String args[]){
        char arr[][] = {{' ',' ',' ',' '},{' ',' ','X',' '},{' ',' ',' ',' '},{' ','X','X',' '}};
        backtrack(arr,0,0,3,3,"");
    }
    public static void backtrack(char arr[][],int r, int c, int dr, int dc, String s){
        if(r > dr || c> dc || arr[r][c] == 'X')
          return;
        if(r == dr && c == dc){
            System.out.println(s);
            return;
        }

        //vertical
        backtrack(arr,r+1,c,dr,dc,s+'V');

        //horizontal
         backtrack(arr,r,c+1,dr,dc,s+'H');
        
        //diagonal
        backtrack(arr,r+1,c+1,dr,dc,s+'D');
    }
}