public class LinearSearch{
    public static void main(String args[]){
        int arr[] = {1,3,555,6,9,11,2};
        int target = 55;
        System.out.println(linearSearch(arr,target));
    }
    public static int linearSearch(int arr[], int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target)
              return i;
        }
        return -1;
    }
}