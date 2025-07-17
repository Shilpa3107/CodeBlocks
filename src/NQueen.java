public class NQueen{
    public static void main(String args[]){
        int n = 4;
        int arr[][] = new int[n][n];
        place(0,n,arr);
    }
    public static void place(int row, int n, int arr[][]){
        if(n == 0){
            print(arr);
            return;
        }
        
        for(int col = 0;col<arr[0].length;col++){
           if(isSafe(row,col,arr)){
            arr[row][col] = 1;
            place(row+1,n-1,arr);
            arr[row][col] = 0;
           }
        }
    }
    public static void print(int arr[][]){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] == 1)
                System.out.print("Q ");
                else 
                  System.out.print("- ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    public static boolean isSafe(int row, int col,int arr[][]){
       int r = row;

       //upside
       while(r >=0){
        if(arr[r][col] == 1)
           return false;
        r--;
       }

       //left diagonal
       int c = col;
       r = row;
       while(r >= 0 && c >=0){
           if(arr[r][c] == 1)
             return false;
             r--;
             c--;
       }

       //right diagonal
       c = col;
       r = row;
       while(r >=0 && c < arr.length){
            if(arr[r][c] == 1)
              return false;
            r--;
            c++;
       }

       return true;
    }
}