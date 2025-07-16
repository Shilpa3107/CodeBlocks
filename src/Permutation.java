import java.util.List;
import java.util.ArrayList;
public class Permutation{
    public static void main(String args[]){
       int s[] = {1,2,3};
       List<List<Integer>> lists = new ArrayList<>();
       generate(s,new boolean[s.length],new ArrayList<>(), lists);
       for(List<Integer> l : lists)
         System.out.println(l+" ");
    
    }
    public static void generate(int s[], boolean used[], List<Integer> list, List<List<Integer>> lists){
        if(list.size() == s.length){
            lists.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0;i<s.length;i++){
            if(used[i])
              continue;
            used[i] = true;
            list.add(s[i]);
            generate(s,used,list,lists);
            list.remove(list.size()-1);
            used[i] = false;
        }
    }
}