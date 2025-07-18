public class QuickSort{
    public static void main(String args[]){
        int arr[] = {7,5,1,3,9,4};
        sort(0,arr.length-1,arr);
    
        for(int n : arr)
          System.out.print(n+" ");
    }
    public static void sort(int start, int end, int arr[]){
        if(start > end)
          return;
          int p = find(start,end,arr);
          sort(start,p-1,arr);
          sort(p+1,end,arr);
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