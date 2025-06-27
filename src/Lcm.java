import java.util.Scanner;
public class Lcm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int i = 2;
        int hcf = 1;
        while(i<Math.min(a,b)){
            if(a%i==0 && b%i==0)
               hcf = i;
            i++;
            
        }
        System.out.println((a*b)/hcf);
    }
}
