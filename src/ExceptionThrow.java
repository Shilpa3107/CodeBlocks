public class ExceptionThrow{
    public static void main(String args[])throws Exception{
        int age = 20;
        if(age < 18)
          throw new Exception("You can't drive because you re under 18");
        else 
          throw new Exception("You can drive");
    }
}