import java.util.Scanner;
public class CountChar{
    public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      char ch = sc.next().charAt(0);
      sc.close();
      int count = 0;
      for(char c : str.toCharArray()){
        if(ch == c)
          count++;
      }
      System.out.println(count);
    }

}