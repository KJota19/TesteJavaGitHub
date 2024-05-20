//POSITIVO, NEGATIVO, IGUAL A ZERO?

package Operadores;

import java.util.Scanner;

public class Teste03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite um número : ");
        int numero = leitor.nextInt();
        
        boolean isNumeroPositivo = numero > -1;
        boolean isNumeroNegativo = numero < 0;
        boolean isNumeroZero = numero == 0;

        System.out.println("O número é positivo ? " + isNumeroPositivo);
        System.out.println("O número é negativo ? " + isNumeroNegativo);
        System.out.println("O número é igual a zero ? " + isNumeroZero);
    }
    
}
