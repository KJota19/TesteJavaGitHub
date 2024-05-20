//AREA E PERIMETRO DO CIRCULO

package Operadores;

import java.util.Scanner;
public class Teste02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite o valor do raio do circulo:");
        float raio = leitor.nextFloat();

        float area = 3.14f * (raio*raio);
        float perim = 2 * 3.14f * raio;
        
        System.out.println("a area do circulo: " + area);
        System.out.println("o perimetro do circulo: " + perim);
    }
}
