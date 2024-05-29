//SOMA DOS NUMEROS PARES

public class Teste01 {

    public static void main(String[] args) {
        int num = 10;
        int par=0;
        for (int i = 0; i <= num; i++) {
          if (i % 2 == 0) {
            par+=i;
          }
        }System.out.println("a soma dos números pares é = " + par);
    }
}