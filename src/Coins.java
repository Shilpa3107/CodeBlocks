public class Coins{
    public static void main(String args[]){
        int coins[] = {2,3,5};
        int target = 8;
        backtrack(target, coins, "", coins.length-1);
    }
    public static void backtrack(int target, int coins[], String ans,int ind){
        if(target==0 && ind>=0){
            System.out.println(ans);
            return;
        }
        if(target < 0 || ind < 0)
          return;
        
        backtrack(target-coins[ind],coins,coins[ind]+""+ans,ind);
        backtrack(target, coins, ans, ind-1);
    }
}