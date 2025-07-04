public class ZigZagTraversal {
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,1,2},{3,4,5,6}};
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(i%2==0){
              j = 0;
              while(j<arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            }
            else {
              j = arr[0].length-1;
              while(j>=0){
                System.out.print(arr[i][j]+" ");
                j--;
            }
            }
        }
    }
}
