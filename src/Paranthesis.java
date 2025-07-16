import java.util.ArrayList;
import java.util.Stack;
public class Paranthesis{
    public static void main(String args[]){
        int n = 3;
        ArrayList<String> list = new ArrayList<>();
        generateParanthesis("",0,0,n,list);
        for(String s : list){
            if(checkValid(s))
              System.out.println(s);
        }
    }
    public static void generateParanthesis(String s, int op,int cl , int n,ArrayList<String> list){
        if(op==n && cl == n){
            list.add(s);
            return;
        }
        if(op > n || cl > n)
          return;
        generateParanthesis(s+'(',op+1,cl,n,list);
        generateParanthesis(s+')',op,cl+1,n,list);
    }
    public static boolean checkValid(String s){
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1;i<s.length();i++){
            if(!stack.isEmpty() && s.charAt(i)==')' && stack.peek() == '(')
              stack.pop();
            else if(s.charAt(i) == '(')
              stack.push('(');
        }
        return stack.isEmpty();
    }
}