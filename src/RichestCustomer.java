public class RichestCustomer {
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{3,2,1}};
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<arr[0].length;j++){
                sum += arr[i][j];
            }
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}
