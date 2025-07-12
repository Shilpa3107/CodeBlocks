public class Sequences2{
    public static void main(String args[]){
        int cc = 0, cr = 0, dc = 2, dr = 2;
        generateSequences("",cr,cc,dr,dc);
    }
    public static void generateSequences(String ans, int cr, int cc,int dr,int dc){
        if(cr==dr && cc==dc){
            System.out.print(ans+" ");
            return;
        }
        if(cr > dr || cc > dc)
           return;

        //horizontal
        generateSequences(ans+'H',cr+1,cc,dr,dc);

        //vertical
        generateSequences(ans+'V',cr,cc+1,dr,dc);
    }
}