public class CharToString {
    public static void main(String args[]){
        // char ch ='A';
        // System.out.println(ch);
        // //type casting
        // System.out.println((int)ch);
        // //type casting
        // System.out.println((char)97);
        String s = "harsh";
        //int count = 0;
        for(char ch : s.toCharArray()){
            if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
               System.out.print(ch+" ");
        }
    }
}
