public class QuickSort{
    public static void main(String args[]){
        int arr[] = {7,5,1,3,9,4};
        int pivot = find(0,arr.length-1,arr);
        int p = find(0,pivot,arr);
        int e = find(pivot+1,arr.length-1,arr);
        for(int n : arr)
          System.out.print(n+" ");
    }
    public static int find(int start, int end, int arr[]){

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

        return pivot;
    }
}