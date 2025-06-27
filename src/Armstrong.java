import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int temp = num;
            int temp1 = num;
            int count = 0;
            while(num!=0){
                count++;
                num = num/10;
            }
            int ans = 0;
            while(temp!=0){
                ans += Math.pow(temp%10,count);
                temp = temp/10;
            }
            if(ans == temp1)
              System.out.println("Armstrong number");
            else 
            System.out.println("Not armstrong number");
        }
        
    }
}
