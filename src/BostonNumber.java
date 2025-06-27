import java.util.Scanner;
public class BostonNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int sum = 0;
        int temp = n;
        //factors of n
        int i = 2;
        while(n!= 1){
            if(n%i==0){
                n = n/i;
                sum += sumOfDigits(i);
            }
            else 
               i++;
        }
        System.out.println((sumOfDigits(temp)==sum)?"Boston Number":"Not a Boston Number");
    }
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}
