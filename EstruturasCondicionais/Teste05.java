//IDADE

package EstruturasCondicionais;

public class Teste05 {
    public static void main(String[] args) {
        int idade=49;
      if (idade <= 18) {
        System.out.println("adolecente");
      }else if (idade >= 19 && idade <= 35) {
        System.out.println("adulto");
      }else if (idade > 36 && idade <= 55) {
        System.out.println("coroa");
      }else if (idade > 56 && idade <= 80 ) {
        System.out.println("idoso");
      }
    }
}
