import java.util.Scanner;
public class Perfect{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int i = 1;
        int sum = 0;
        while(i<num){
            if(num%i==0){
                sum +=i;
            }
            i++;
        }
        if(sum == num)
          System.out.println("Perfect Number");
        else 
          System.out.println("Not a Perfect Number");
    }
}