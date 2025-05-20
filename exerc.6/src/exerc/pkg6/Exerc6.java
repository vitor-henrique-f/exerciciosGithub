
package exerc.pkg6;


public class Exerc6 {

    
    public static void main(String[] args) {
        System.out.println(palindromo("casa"));
    }
     public static boolean palindromo(String texto) {
        char[] filtrado = new char[texto.length()];
        int tamanho = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c != ' ') {
                if (c >= 'A' && c <= 'Z') {
                    c = (char)(c + 32);
                }
                filtrado[tamanho] = c;
                tamanho++;
            }
        }

        for (int i = 0; i < tamanho / 2; i++) {
            if (filtrado[i] != filtrado[tamanho - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
