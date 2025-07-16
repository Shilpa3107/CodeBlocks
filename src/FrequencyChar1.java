import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class FrequencyChar1{
    public static void main(String args[]){
        String s = "abbaabcdeabacde";
        // String result ="";
        // for(char ch :s.toCharArray()){
        //     if(!result.contains(ch+"")){
        //         int count = 0;
        //         for(char c : s.toCharArray()){
        //             if(c == ch){
        //                 count++;
        //             }
        //         }
        //         result += ch +""+count;
        //     }
        // }
        // System.out.println(result);
        int freq[] = new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int j = 0;j<26;j++){
            if(freq[j]>0)
              System.out.println((char)(j+'a')+"->"+freq[j]);
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        System.out.println(Collections.binarySearch(list,6));
        

    }
}