public class PrimeNumber2{
    public static void main(String args[]){
       boolean mat[] = new boolean[100000];
       for(int i = 2;i<=100000;i++){
            if(!mat[i]){
              System.out.print(i+" ");
                for(int j = 2*i;j<100000;j=j+i){
                    mat[j] = true;
                }
            }
       }
    }
}