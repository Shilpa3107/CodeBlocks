import java.util.Scanner;
public class Age{
    public static void main(String args[]){
      try (Scanner sc = new Scanner(System.in)) {
        int age = sc.nextInt();
          if(age < 10)
            System.out.println("Not alloed to seat on the front");
          else if(age >= 10 && age <16 )
            System.out.println("You can allowed to seat but can't drive");
        else if(age >=16 && age<=18)
            System.out.println("You can learn to drive");
            else
              System.out.println("You can drive");
      }
    }
}