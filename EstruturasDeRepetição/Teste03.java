// É OU NÃO É NÚMERO PRIMO

public class Teste03 {
    public static void main(String[] args) {
        int num = 2;
        int tot=0;
        for (int i = 1; i < num+1; i++) {
          if (num % i == 0) {
            tot+=1;
            System.out.println("primo  " + i);       
          }else{
            System.out.println("Não " + i);
          }
      }System.out.println("o número" + num + " foi divisivel " + tot + " vezes ");
      if (tot == 2) {
        System.out.println("por tanto é primo");
      }else{
        System.out.println("por tanto não é primo");
      }
    }
}
