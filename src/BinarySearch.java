public class BinarySearch{
    public static void main(String args[]){
        int arr[] = {1,5,8,11,17,23,27,29};
        System.out.println(binarySearch(arr,27));
        System.out.println(binarySearch(arr,9));
    }
    public static int binarySearch(int arr[], int target){
        int start = 0, end = arr.length-1;
        while(start <= end){
           int  mid = start+(end-start)/2;
            if(arr[mid] == target)
               return mid;
            else if(arr[mid] > target)
               end = mid-1;
            else 
               start = mid+1;
        }
        return -1;
    }
}