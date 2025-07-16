public class MultiplyNum{
    public static void main(String args[]){
        int n  = 5, x = 2;
        System.out.println(recursion(n,x));
    }
    public static int recursion(int n, int x){
        if(n==1)
            return x;
        return x*recursion(n-1,x);
    }
}