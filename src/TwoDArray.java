import java.util.Scanner;
public class TwoDArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++)
              arr[i][j] = sc.nextInt();
        }
        sc.close();
        print(arr);
    }
    public static void print(int arr[][]){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}