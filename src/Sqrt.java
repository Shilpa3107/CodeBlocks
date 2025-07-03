public class Sqrt {
    public static void main(String args[]){
         int x= 8;
         System.out.println(sqrts(x));
    }
    public static int sqrts(int x){
        int start = 0, end = x-1;
        while(start <=end){
            int mid = start+(end-start)/2;
            if((long)mid*mid == x)
              return mid;
            else if((long)mid*mid > x)
               end = mid-1;
            else 
               start = mid+1;
        }
        return end;
    }
}
