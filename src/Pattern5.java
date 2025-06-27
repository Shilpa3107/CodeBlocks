import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.close();
        int n = 0;
        if(len%2==0)
           n = len/2;
        else 
          n = len/2+1;
        int i = 1,temp = 0;
        while(i<=n){
            int space = n-i;
            while(space-->0){
                System.out.print(" ");
            }
            int j = 2*i-1;
            while(j-->0){
                System.out.print("*");
            }
            System.out.println();
            temp = 2*i-1;
            i++;
        }
        i = 1;
        while(i<=(len-n)){
            int space = i;
            while(space-->0){
                System.out.print(" ");
            }
            int j = temp-2*i;
            while(j-->0){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
