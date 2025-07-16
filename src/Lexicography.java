public class Lexicography{
    public static void main(String args[]){
        int n = 114;
        for(int i = 1;i<=9;i++){
            generate(i,n);
        }
    }
    public static void generate(int i, int n){
        if(i > n)
          return;
        System.out.print(i+" ");
         i = i*10;
         for(int j = 0;j<=9;j++){
            generate(i+j,n);
         }
    }
}