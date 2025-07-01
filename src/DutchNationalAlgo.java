public class DutchNationalAlgo {
    public static void main(String args[]){
        int nums[] = {2,0,1,1,0};
        int start = 0, end = nums.length-1, i = 0;
        while(i<=end){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
                i++;
            }
            else if(nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
            else 
              i++;
        }
        for(int n : nums)
          System.out.print(n+" ");
    }
}
