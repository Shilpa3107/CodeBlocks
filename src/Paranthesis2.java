public class Paranthesis2{
    public static void main(String args[]){
        int n = 3;
        generateValidParanthesis("",0,0,n);
    }
    public static void generateValidParanthesis(String ans, int op, int cl, int n){
        if(op==n && cl == n){
            System.out.println(ans);
            return ;
        }
        if(op < n)
             generateValidParanthesis(ans+'(',op+1,cl,n);
        if(cl < op)
          generateValidParanthesis(ans+')',op,cl+1,n);
    }
}