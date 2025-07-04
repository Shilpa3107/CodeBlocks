public class PeakIndex{
    public static void main(String args[]){
       int arr[] = {0,1,0};
       System.out.println(peakIndex(arr));
    }
    public static int peakIndex(int arr[]){
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = (end-start)/2+start;
            if(mid+1< arr.length && arr[mid] < arr[mid+1])
              start = mid+1;
            else 
              end = mid-1;
        }
        return start;
    }
}