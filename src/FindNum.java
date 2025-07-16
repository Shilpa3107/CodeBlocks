public class FindNum{
    public static void main(String args[]){
        int arr[] = {6,2,9,1,9,6,2,3,1,2,1};
        int target = 6;
        System.out.println(find(arr, 0, target));
    }
    public static int find(int arr[], int ind, int target){
        if(ind >= arr.length) {
            return -1; 
        }
        if(arr[ind] == target) {
            return ind;
        }
        return find(arr, ind + 1, target);
    }
}