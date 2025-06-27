public class Table {
    public static void main(String args[]){
         int num = 2, i =1;
         while(num <=10){
           System.out.print(num*i+" ");
           i++;
           if(i > 10){
            System.out.println();
            num++;
            i = 1;
           }
         }
    }
}
