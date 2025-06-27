import java.util.Scanner;
public class Digits {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int count = 0;
            while(num != 0){
                count++;
                num = num/10;
            }
            System.out.println(count);
        }
    }
}
