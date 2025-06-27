public class Lcm {
    public static void main(String args[]){
        int a =7, b = 8;
        int i = 2;
        int hcf = 1;
        while(i<Math.min(a,b)){
            if(a%i==0 && b%i==0)
               hcf = i;
            i++;
            
        }
        System.out.println((a*b)/hcf);
    }
}
