import java.util.HashSet;
import java.util.Set;
public class Sequences{
    public static void main(String args[]){
        String str = "HHVV";
        Set<String> result = new HashSet<>();
        boolean used[] = new boolean[str.length()];
        generateSequences(str,new StringBuilder(), result, used);
        for(String s : result)
          System.out.println(s);
    }
    public static void generateSequences(String s, StringBuilder sb,  Set<String> result, boolean used[]){
        if(sb.length() == 4){
          result.add(sb.toString());
          return;
        }
        for(int i = 0;i<s.length();i++){
            if(used[i])
              continue;
            used[i] = true;
            sb.append(s.charAt(i));
            generateSequences(s,sb,result,used);
            sb.deleteCharAt(sb.length()-1);
            used[i] = false;
        }

    }
}