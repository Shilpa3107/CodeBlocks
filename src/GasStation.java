public class GasStation{
    public static void main(String args[]){
          int gas[] = {1,2,3,4,5};
          int cost[] = {3,4,5,1,2};
          System.out.println(canCompleteCircle(gas,cost));
    }
    public static int canCompleteCircle(int gas[], int cost[]){
        for(int i = 0;i<gas.length;i++){
            int fuel = 0,temp = 0;
            for(int j = i;j<(i+gas.length);j++){
                fuel += gas[j%gas.length]-cost[j%gas.length];
                if(fuel < 0){
                    temp = 1;
                    break;
                }
            }
            if(temp == 0)
            return i;
        }
        return -1;
    }
}