public class DiagonalMatrix{
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,1,2},{3,4,5,6}};
        for(int i = arr[0].length-1;i>=0;i--){
            int j = i, col = 0;
            while(j<arr.length && col < arr.length){
                System.out.print(arr[j][col]+" ");
                j++;
                col++;
            }
        }
        for(int i = 1;i<arr.length;i++){
            int c = i, row = 0;
            while(row<arr.length && c<arr.length){
                System.out.print(arr[row][c]+" ");
                row++;
                c++;
            }
        }
    }
}