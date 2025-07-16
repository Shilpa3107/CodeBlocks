import java.util.ArrayList;
public class Sequence3{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        int cc = 0, cr = 0, dr = 2,dc = 2;
        generateSequences("",list,cc,cr,dr,dc);
        System.out.println(list.size());
    }
    public static void generateSequences(String ans, ArrayList<String> list, int cc, int cr, int dr, int dc){
        if(cc == dr && cr==dr){
            list.add(ans);
            return;
        }
        if(cc > dc || cr > dc)
          return;
        generateSequences(""+'H',list,cc+1,cr,dr,dc);
        generateSequences(""+'V',list,cc,cr+1,dr,dc);
    }
}