public class MultiplyNum1{
    public static void main(String args[]){
        int num = 5, x = 3;
        System.out.println(recursion(num,x));
        
    }
    public static int recursion(int num, int x){
        
        if(num == 1){
            return x;
        }

        int res = recursion(num/2,x);

        if(num %2 == 0)
          return res*res;

        else 
          return res*res*x;
    }
}