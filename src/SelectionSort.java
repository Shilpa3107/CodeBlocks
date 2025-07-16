public class SelectionSort{
    public static void main(String args[]){
        int nums[] = {3,6,1,5,8,9,13,45};
        for(int i = 0;i<nums.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<nums.length;j++){
                if(nums[j]<nums[minIndex]){
                    minIndex=j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
        }
        System.out.println("sorted array");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}