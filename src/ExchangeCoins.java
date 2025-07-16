public class ExchangeCoins{
    public static void main(String args[]){
        int coins[] = {2,3,5};
        exchange("",8,coins,0);
    }
    public static void exchange(String ans, int target, int coins[], int j){
        if(target == 0){
            System.out.println(ans);
            return;
        }
        for(int i = j;i<coins.length;i++){
            if(target >= coins[i]){
                exchange(ans+""+coins[i],target-coins[i],coins,i);
            }
        }
    }
}