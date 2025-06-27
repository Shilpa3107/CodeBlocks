import java.util.Scanner;
public class Income {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int income = sc.nextInt();
            int offer = sc.nextInt();
            if(income>=7){
                if(offer >3)
                   System.out.println("Best");
                else 
                  System.out.println("Average");
            }
            else if(income < 7 ){
                if(offer >= 3)
                  System.out.println("Good");
                else if(offer < 3)
                  System.out.println("Bekar");
            }
        }
    }
}
