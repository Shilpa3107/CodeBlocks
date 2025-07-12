public class Substrings{
    public static void main(String args[]){
        String s = "baaba";
        String result = "";
        for(int i = 0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                if(palindrome(s.substring(i,j+1)) && result.length() < s.substring(i,j+1).length()){
                    result = s.substring(i,j+1);
                }
            }
        }
        System.out.println(result);
    }
    public static boolean palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j))
              return false;
            i++;
            j--;
        }
        return true;
    }
}