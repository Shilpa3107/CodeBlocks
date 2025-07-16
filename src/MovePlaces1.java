public class MovePlaces1{
    public static void main(String args[]){
        char arr[][] = {{' ',' ',' ',' '},{' ',' ','X',' '},{' ',' ',' ',' '},{' ','X','X',' '}};
        System.out.println(backtrack(arr,0,0,3,3,""));
    }
    public static int backtrack(char arr[][],int r, int c, int dr, int dc, String s){
        if(r > dr || c> dc || arr[r][c] == 'X')
          return 0;
        if(r == dr && c == dc){
            System.out.println(s);
            return 1;
        }

        //vertical
        int v = backtrack(arr,r+1,c,dr,dc,s+'V');

        //horizontal
         int h = backtrack(arr,r,c+1,dr,dc,s+'H');
        
        //diagonal
        int d = backtrack(arr,r+1,c+1,dr,dc,s+'D');
        return v+h+d;
    }
}