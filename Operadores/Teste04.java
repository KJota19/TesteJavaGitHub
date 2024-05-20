//CENTIMETROS E MILIMETROS

package Operadores;

import java.util.Scanner;

public class Teste04 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);

     System.out.println("Digite um valor em metros:");
     int metro = leitor.nextInt();
     
     int dm = metro * 10;
     int cm = dm * 10;
     int mm = cm * 10;
     
     System.out.println("O valor em centimetros é: " + cm);
     System.out.println("O valor em milimetros é: " + mm); 
    }
}
