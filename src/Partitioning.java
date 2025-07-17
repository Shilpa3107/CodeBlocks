import java.util.List;
import java.util.ArrayList;
public class Partitioning{
    public static void main(String args[]){
       String s = "aab";
       List<String> list = new ArrayList<>();
       partition(s,list);
    }
    public static void partition(String s, List<String> list){
        if(s.length() == 0){
            System.out.println(list);
          return;
        }

        for(int i = 1;i<=s.length();i++){
            String str = s.substring(0,i);
            if(isPalindrom(str) == true){
                list.add(str);
                partition(s.substring(i),list);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean isPalindrom(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}