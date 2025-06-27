public class Pattern {
    public static void main(String args[]){
        int i = 1,j = 1;
        while(i<=5){
            while(j<=5){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
            j = 1;
        }
    }
}
