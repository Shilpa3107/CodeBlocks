import java.util.Scanner;
public class HappyNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for(int i = 1;i<=1000;i++){
            int sum = 0;
            while(num > 0){
            sum += Math.pow(num%10,2);
            num = num/10;
            }
            num = sum;
            if(num == 1)break;
        }
        System.out.println((num == 1)?"Happy Number":"Not a happy number");
    }
}
