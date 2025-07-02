public class GasStation1{
    public static void main(String args[]){
            int gas[] = {3,1,1};
            int cost[] = {1,2,2};
            System.out.println(gasStation1(gas,cost));
    }
    public static int gasStation1(int gas[], int cost[]){
        int totalGas = 0, totalCost = 0, ans = 0;
        for(int i = 0;i<gas.length;i++){
            totalCost += cost[i];
            totalGas += gas[i];
        }
        int fuel = 0;
        for(int i = 0;i<gas.length;i++){
            fuel += gas[i]-cost[i];
            if(fuel < 0){
                ans = i+1;
                fuel = 0;
            }
        }
        return totalGas<totalCost ? -1:ans;
    }
}