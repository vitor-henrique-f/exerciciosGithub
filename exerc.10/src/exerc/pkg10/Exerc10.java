package exerc.pkg10;

public class Exerc10 {

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }

    public static boolean fibonacci(int n) {
        if (n < 0) {
            return false; 
        }

        int a = 0;
        int b = 1;

        while (b < n) {
            int x = b;
            b = a + b;
            a = x;
        }

        return b == n || n == 0;
    }
}
