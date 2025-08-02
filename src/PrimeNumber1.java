public class PrimeNumber1{
    public static void main(String args[]){
         for(int i = 1;i<=100000;i++){
            if(i > 1 && primeNumber(i))
              System.out.print(i+" ");
         }
    }
    public static boolean primeNumber(int n){
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0)
              return false;
        }
        return true;
    }
}