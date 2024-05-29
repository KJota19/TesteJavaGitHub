//MÉDIA DE UMA SEQUÊNCIA

import java.util.Scanner;

public class Teste05 {
    public static void main(String[] args) {
        int tot = 0 ;
        Scanner leitor = new Scanner (System.in);
        System.out.println("digite o tamanho da sequencia :");
            int num = leitor.nextInt();
              for (int i = 0; i < num; i++) {
                System.out.println("digite um número:");
                int num2 = leitor.nextInt();
                if (num2 < -1) {
                   break;
                
                }else{
                  tot+=num2;
                }
              }
                int media = tot / num;
                System.out.println(" a média é: " + media);
    }
}
