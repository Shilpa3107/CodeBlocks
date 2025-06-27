public class Pattern1 {
    public static void main(String args[]){
       int i = 0,j = 0;
       while(i<3){
        while(j<3){
            if(j<=i)
              System.out.print("* ");
            else 
              System.out.print("  ");
            j++;
        }
        System.out.println();
        i++;
        j = 0;
       }
    }
}
