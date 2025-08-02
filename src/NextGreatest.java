public class NextGreatest {
    public static void main(String args[]){
        int arr[] = {3,1,2,4,6,1,2,1};
        int target[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            target[i] = greatest(arr,i);
        }
        for(int n : target)
          System.out.print(n+" ");
    }
    public static int greatest(int arr[], int ind){
        int num = arr[ind];
        for(int i = ind;i<arr.length;i++){
            if(num < arr[i])
              return arr[i];
        }
        return -1;
    }
}
