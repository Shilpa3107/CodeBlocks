import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i =1;
        while(i<=n){
            int j = 1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j = 1;
            while(j<=2*i-1){
                System.out.print("*");
                j++;
            }
            

            System.out.println();
            i++;
        }
    }
}
