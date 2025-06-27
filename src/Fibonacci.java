public class Fibonacci{
    public static void main(String args[]){
        int first = 0, second = 1,third;
        int num = 15;
        System.out.print(first+" "+second+" ");
        num = num-2;
        while(num-->0){
             third = first+second;
             System.out.print(third+" ");
             first = second;
             second = third;
        }
    }
}