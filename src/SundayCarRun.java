import java.util.Scanner;
public class SundayCarRun {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        sc.close();
        long evenSum = 0, oddSum = 0;
        while(num > 0){
            long dig = num%10;
            if(dig%2==0)
              evenSum += dig;
            else 
              oddSum += dig;
            num = num/10;
        }
        System.out.println((evenSum>0 && evenSum%4==0 ||  oddSum >0 && oddSum%3==0)?"Run on sunday":"Not run on sunday");
    }
}
