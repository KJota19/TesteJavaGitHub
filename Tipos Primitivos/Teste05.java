//nome e idade

package Tipos Primitivos;

import java.util.Scanner;
public class Teste05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome=leitor.nextLine();
        System.out.println("digite sua idade:");
        int idade=leitor.nextInt();
        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");

      }
    
}

