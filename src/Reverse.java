public class Reverse{
    public static void main(String args[]){
        int nums[] ={1,2,3,4,5,6,7,8,9,10};
        int reverse[] = new int[nums.length];
        int j = 0;
        for(int i = nums.length-1;i>=0;i--){
            reverse[j++] = nums[i];
        }
        for(int i = 0;i<nums.length;i++)
           System.out.print(reverse[i]+" ");
    }
}