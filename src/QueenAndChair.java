public class QueenAndChair{
    public static void main(String args[]){
        boolean chair[] = new boolean[3];
        Seat("",2,chair);
    }
    public static void Seat(String ans,int n, boolean chair[]){
         if(n==0){
            System.out.println(ans);
            return;
         }

        for(int i = 0;i<chair.length;i++){

            //since chair is empty. I can let queen to sit
            if(!chair[i]){

                //After putting her in seat, that seat would be filled
                chair[i] = true;

                //and now I have to put n-1 queens in the seat
                 Seat(ans+"C"+i+"Q"+n+" ",n-1,chair);

                chair[i] = false;
            }
        }
    }
}