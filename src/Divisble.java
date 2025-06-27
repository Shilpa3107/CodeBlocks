public class Divisble {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000) {
            if (i % 2 == 0 && i % 3 == 0 && i % 7 == 0)
                System.out.print(i+" ");
            i++;
        }
    }
}
