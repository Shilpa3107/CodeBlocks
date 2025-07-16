public class Stack{
    public static void main(String args[]){
          fun();
          System.out.println("Inside main");
    }
    public static void fun(){
        System.out.println("Inside a function");
        fun1();
        System.out.println("Function 1 ends");
    }
    public static void fun1(){
        System.out.println("Inside function 1");
    }
}