import java.util.Scanner;
public class Sum {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int sum = 0;
            while(num != 0){
                int dig = num%10;
                sum += dig;
                num = num/10;
            }
            System.out.println(sum);
        }
            
        }
    }

