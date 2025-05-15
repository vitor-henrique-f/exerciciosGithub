
package exerc.pkg1;


public class Exerc1 {

    public static void main(String[] args) {
        System.out.println(numeroPerfeito(6));
    }
    public static boolean numeroPerfeito (int x){
     int n = 0;
     if (x <= 0) {
         return false;
     }
     for (int i = 1; i < x; i++){
         if (x % i == 0) {
             n += i;
         }
    }
     return n == x;
}
}