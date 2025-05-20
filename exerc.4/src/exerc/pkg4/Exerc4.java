package exerc.pkg4;

public class Exerc4 {

    public static void main(String[] args) {
        String[] con = {"oi", "não", "sim", "palavra", "claro"};
        System.out.println(stringVogais(con));
    }

    public static String stringVogais(String[] x) {
        int max = -1;
        String resultado = "";

        for (int i = 0; i < x.length; i++) {
            int con = 0;
            String atual = x[i];

            for (int j = 0; j < atual.length(); j++) {
                char c = atual.charAt(j);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    con++;
                }
            }

            if (con > max) {
                max = con;
                resultado = atual;
            }
        }

        return resultado;
    }
}
