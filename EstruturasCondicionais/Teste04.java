//LADOS TRIÂNGULO

package EstruturasCondicionais;

public class Teste04 {
    public static void main(String[] args) {
        int valor1 = 2;
      int valor2 = 2;
      int valor3 = 4;
      if (valor1 + valor2 > valor3 && valor1 + valor3 > valor2 && valor2 + valor3 > valor1) {
        System.out.println("os lados formam um triângulo válido.");
      }else{
        System.out.println("os lados não formam um triângulo válido.");
      }
    }
}
