package exerc.pkg2;

public class Exerc2 {

    public static void main(String[] args) {
        System.out.println(substituicaoVogais("casa"));
    }

    public static String substituicaoVogais(String x) {
        char[] resultado = new char[x.length()];

        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                resultado[i] = '*';
            } else {
                resultado[i] = c;
            }
        }

        return new String(resultado);
    }
}
