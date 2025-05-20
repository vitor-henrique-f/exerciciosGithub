package exerc.pkg3;

public class Exerc3 {

    public static void main(String[] args) {
        int[] con = {1, 2, 3, 4, 5};
        System.out.println(valorAbsoluto(con));
    }

    public static int valorAbsoluto(int[] n) {
        int maior = 0;

        for (int i = 0; i < n.length; i++) {
            int valorAbsoluto = n[i] < 0 ? -n[i] : n[i];
            if (valorAbsoluto > maior) {
                maior = valorAbsoluto;
            }
        }

        return maior;
    }
}
