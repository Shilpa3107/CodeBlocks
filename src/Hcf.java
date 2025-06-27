import java.util.Scanner;
public class Hcf {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i = 2;
            int max = 0;
            while(i<=Math.min(a,b)){
                if(a%i==0 && b%i==0)
                  max = Math.max(max,i);
                i++;
            }
            System.out.println(max);
        }
    }
}
