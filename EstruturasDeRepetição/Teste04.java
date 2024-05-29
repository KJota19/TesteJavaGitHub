//SEQUÊNCIA DE FIBONACCI

public class Teste04 {
    public static void main(String[] args) {
        
      int num = 10;
      int primeiroNum = 0;
      int segundoNum = 1;
      int proximo=0;
      for (int i = 0; i < num; i++) {
        proximo = primeiroNum + segundoNum;
        primeiroNum=segundoNum;
        segundoNum=proximo;
        System.out.println("a sequencia de fibonacci com " + num + " é " + proximo);
      }
    }
}
