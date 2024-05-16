package Operadores;

import java.util.Scanner;
    public class Teste01 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner (System.in);
        
            System.out.println("Digite o primeiro número:");
            int num1 = leitor.nextInt();
        
            System.out.println("Digite o segundo número:");
            int num2 = leitor.nextInt();
        
            int soma = num1 + num2;
            int sub =  num1 - num2;
            int mult = num1 * num2;
            double div = num1 / (double) num2;
            int resto = num1 % num2;

            System.out.println("a soma é " + soma);
            System.out.println("a subtração " + sub);
            System.out.println("a multiplicação é " + mult);
            System.out.println("a divisão é " + div);
            System.out.println("o resto é " + resto);
        }
    }