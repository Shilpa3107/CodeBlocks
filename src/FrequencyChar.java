public class FrequencyChar{
    public static void main(String args[]){
        String s = "aaaabbbceeefffxyzz";
        for(int i = 0;i<s.length()-1;){
            int j = i;
            while(j<s.length() && s.charAt(j) == s.charAt(i)){
                j++;
            }
            System.out.print(s.charAt(i)+""+(j-i));
            i = j;
        }
    //     String result = "";
    //     for(char ch :s.toCharArray()){
    //         if(!result.contains(ch+"")){
    //             result = result+ch+count(s,ch);
    //         }
    //     }
    //     System.out.println(result);
    // }
    // public static int firstOccurrence(String s, char ch){
    //     int start = 0, end = s.length()-1;
    //     int res = -1;
    //     while(start<=end){
    //         int mid = start+(end-start)/2;
    //         if(s.charAt(mid) == ch){
    //            res = mid;
    //            end = mid-1;
    //         }
    //         else if(s.charAt(mid)<ch)
    //           start = mid+1;
    //         else 
    //           end = mid-1;
    //     } 
    //     return res;
    // }
    // public static int lastOccurrence(String s, char ch){
    //     int start = 0, end = s.length()-1;
    //     int res = -1;
    //     while(start<=end){
    //         int mid = start+(end-start)/2;
    //         if(s.charAt(mid) == ch){
    //            res = mid;
    //            start = mid+1;
    //         }
    //         else if(s.charAt(mid)<ch)
    //           start = mid+1;
    //         else 
    //           end = mid-1;
    //     } 
    //     return res;
    // }
    // public static int count(String s, char ch){
    //     return lastOccurrence(s,ch)-firstOccurrence(s,ch)+1;
    // }
    }
}