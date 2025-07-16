public class Sequence4{
    public static void main(String args[]){
        int n = 4, m = 3;
        int cc = 0, cr = 0, dc = n-1, dr = m-1;
        System.out.println(generateSequences("",cc,cr,dc,dr));
    }
    public static int generateSequences(String ans, int cc, int cr, int dc, int dr){
        if(cc == dc && cr == dr){
            System.out.print(ans+" ");
            return 1;
        }
        if(cc > dc || cr > dr)
           return 0;
        
         int h =  generateSequences(ans+'H',cc+1,cr,dc,dr);
         int v = generateSequences(ans+'V',cc,cr+1,dc,dr);
        return h+v;
    }
}