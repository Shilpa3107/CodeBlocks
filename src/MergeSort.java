public class MergeSort{
    public static void main(String args[]){
        int num[] = {7,6,11,5,8,2,1};
          int res[] = divide(0,num.length-1,num);
          for(int n : res)
            System.out.print(n+" ");
    }
    public static int[] divide(int start, int end, int ans[]){
        if(start == end){
         int arr[] = new int[1];
         arr[0] = ans[start];
         return arr;
        }
        int mid = (start+end)/2;
        int arr1[] = divide(start,mid,ans);
        int arr2[] = divide(mid+1,end,ans);

        int merge[] = merges(arr1,arr2);

        return merge;


    }
    public static int[] merges(int arr1[],int arr2[]){
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
        return res;
    }
}