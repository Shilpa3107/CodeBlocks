public class MergeSortedArray{
    public static void main(String args[]){
        int arr1[] = {1,7,11,21,29};
        int arr2[] = {2,5,6,13,20};
        int n = arr1.length;
        int m = arr2.length;
        int res[] = new int[n+m];
        int i = 0, j = 0;
        int ind = 0;
        while(i<Math.min(n,m) && j<Math.min(n,m)){
            if(arr1[i]<=arr2[j])
              res[ind++] = arr1[i++];
            else 
              res[ind++] = arr2[j++];
        }
        if(n >= m){
            
            while(i<n){
               res[ind++] = arr1[i++];
            }
        }
        if(m>n){
            
           while(j<m){
                res[ind++] = arr2[j++];
            }
        }
        for(int num : res)
           System.out.print(num+" ");
    }
}