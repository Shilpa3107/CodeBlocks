public class TrappingWater{
    public static void main(String args[]){
         int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
         System.out.println("Trapped Water: " + trappingWater(height));
    }
    public static int trappingWater(int height[]){
        int left[] = new int[height.length];
        int right[] = new int[height.length];   
        int water = 0;
        left[0] = height[0];   
        for(int i = 1; i < height.length; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }   
        right[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--){
            right[i] = Math.max(right[i + 1], height[i]);
        }
        for(int i = 0; i < height.length; i++){
            water += Math.min(left[i], right[i]) - height[i];
        }
        return water;    
    }
}