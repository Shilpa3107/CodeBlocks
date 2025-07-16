import java.util.ArrayList;
public class ExchangeCoins1{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        int coins[] = {2,3,5};
        exchange(coins,8,list,0);
    }
    public static void exchange(int coins[], int target, ArrayList<Integer> list, int i){
       if(target == 0){
         System.out.println(list);
        return;
       }
     while(i<coins.length){
       if(target>=coins[i]){
        list.add(coins[i]);
        exchange(coins,target-coins[i],list,i);
        list.remove(list.size()-1);

    }
    i++;
   }
    }
}