public class DiagonalTraverse2{
    public static void main(String args[]){
        int arr[][] = {{1,2,3},
        {4,5,6},
        {7,8,9}};

        for(int row = 0;row<arr.length;row++){
             int row1 = row;
             int col = 0;
             while(row1>=0 && col < arr.length){
                System.out.print(arr[row1][col]+" ");
                row1--;
                col++;
             }
        }
        for(int col = 1;col<arr.length;col++){
           int row1 = arr.length-1;
            int c = col;
            while(row1 >= 0 && c <=arr.length-1){
                System.out.print(arr[row1][c]+" ");
                row1--;
                c++;
            }
        }
    }
}