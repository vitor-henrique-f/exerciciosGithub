package exerc.pkg7;

public class Exerc7 {

    public static void main(String[] args) {
        System.out.println(calcularMDC(5, 5));
    }

    public static int calcularMDC(int a, int b) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        return a;
    }
}
