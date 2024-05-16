package Operadores;

import java.util.Scanner;
public class Teste05 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    
    System.out.println("Digite um ano: ");
    int ano = leitor.nextInt();
    
    int calculo = ano % 4;
    int calculo2 = ano % 100;
    int calculo3 = ano % 400;
    boolean bissexto= calculo != 0 || calculo2 !=0 && calculo3 !=0;
    
    System.out.println("o ano é bissexto ?" + bissexto);
    }
}
