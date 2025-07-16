public class Paranthesis1{
    public static void main(String args[]){
        int n = 3;
        System.out.println(generateValidParanthesis("",0,0,n));
    }
    public static int generateValidParanthesis(String ans, int op, int cl, int n){
        if(op==n && cl == n){
            System.out.println(ans);
            return 1;
        }
        int open = 0, close = 0;
        if(op < n)
            open = generateValidParanthesis(ans+'(',op+1,cl,n);
        if(cl < op)
          close = generateValidParanthesis(ans+')',op,cl+1,n);
        return open+close;

    }
}