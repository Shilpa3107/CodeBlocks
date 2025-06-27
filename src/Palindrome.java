import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int reverse_num = 0;
        int temp = num;
        while(num > 0){
            reverse_num = reverse_num*10+num%10;
            num = num/10;
        }
        System.out.println((temp == reverse_num) ? "Palindrome" : "Not a Palindrome");
    }
    
}
