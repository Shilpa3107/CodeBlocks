import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 0,j = 0;
        while(i<n){
            j = 0;
            while(j<(n-i)){
                System.out.print("* ");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }
}
