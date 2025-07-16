public class Sum1{
    public static void main(String args[]){
        int num = 5;
        System.out.println(sum(num));
    }
    public static int sum(int num){
        if(num == 1)
          return 1;
        return num+sum(num-1);
    }
}