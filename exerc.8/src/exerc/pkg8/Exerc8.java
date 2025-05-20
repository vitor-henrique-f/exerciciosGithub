package exerc.pkg8;

public class Exerc8 {
    
    public static void main(String[] args) {
        int[] con = {1, 2, 3, 4, 5};
        int[] noc = inverter(con);
        for (int i = 0; i < noc.length;i++){
            System.out.println(noc[i] + "");
        }
            
    }
    
    public static int[] inverter(int[] x) {
        int tamanho = x.length;
        int[] invertido = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            invertido[i] = x[tamanho - 1 - i];
        }
        
        return invertido;
    }
}
