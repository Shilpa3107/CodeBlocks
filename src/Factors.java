import java.util.Scanner;
public class Factors{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i = 2;
            while(n != 1){
                if(n%i==0){
                    n = n/i;
                    System.out.print(i+" ");
                }
                else 
                  i++;
            }
        }
    }
} 