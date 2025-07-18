public class QuickSort{
    public static void main(String args[]){
        int arr[] = {7,5,1,3,9,4};
        find(0,arr.length-1,arr);
        find(0,arr.length-1,arr);
        find(0,arr.length-1,arr);
        for(int n : arr)
          System.out.print(n+" ");
    }
    public static void find(int start, int end, int arr[]){

        int item = arr[end];
        int pivot = start;

        for(int i = start;i<end;i++){
            if(item > arr[i]){
                int temp = arr[pivot];
                arr[pivot] = arr[i];
                arr[i] = temp;
                pivot++;
            }
        }
        int t = arr[pivot];
        arr[pivot] = item;
        arr[end] = t;

        // return pivot;
    }
}