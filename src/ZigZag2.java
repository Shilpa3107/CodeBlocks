public class ZigZag2 {
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i = 0;i<arr[0].length;i++){
            if(i%2==0){
                int j = 0;
                while(j<arr.length){
                    System.out.print(arr[j][i]+" ");
                    j++;
                }
            }
            else{
                int j = arr.length-1;
                while(j>=0){
                    System.out.print(arr[j][i]+" ");
                    j--;
                }
            }
        }
    }
}
