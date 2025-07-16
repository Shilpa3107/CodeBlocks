public class Sequences1{
    public static void main(String args[]){
       generateSequences(3,"");
    }
    public static void generateSequences( int i, String ans){
        if(i == 0){
            System.out.print(ans+" ");
            return;
        }
        generateSequences(i-1,ans+'H');
        generateSequences(i-1,ans+'T');
    }
}