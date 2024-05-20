//VALOR IMPOSTO

package EstruturasCondicionais;

public class Teste02 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double imposto1 = 9.70 / 100;
        double imposto2 = 37.35 / 100;
        double imposto3 = 49.50 / 100;
        double valorImposto;
        if (salarioAnual<= 34712) {
            valorImposto = salarioAnual * imposto1;
            System.out.println(valorImposto);
        }else if (salarioAnual >= 34713 && salarioAnual <=68507) {
            valorImposto = salarioAnual * imposto2;
            System.out.println(valorImposto);
        }else{
            valorImposto = salarioAnual * imposto3;
            System.out.println(valorImposto);            
        }
    }
}
