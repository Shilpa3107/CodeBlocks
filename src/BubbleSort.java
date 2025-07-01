public class BubbleSort{
    public static void main(String args[]){
        int nums[] = {18,3,6,1,6,8,3,9,0,4};
        sort(nums);
        for(int n : nums)
           System.out.print(n+" ");
    }
    public static void sort(int nums[]){
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    } 
}
// Rain water
// product exception
// dutch national
