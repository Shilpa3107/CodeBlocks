public class MaxSubarray {
    public static void main(String args[]){
        int nums[] = {5,2,-9,1,6,7,-3,6};
        System.out.println(maxSubarraySum(nums));
    }
    public static int maxSubarraySum(int nums[]){
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int n : nums){
            curr += n;
            if(curr > max)
               max = curr;
            if(curr < 0){
                curr = 0;
            }
        }
        return max;
    }
    
}
