// BALANÇO TRIMESTRAL E MÉDIA MENSAL DE UMA EMPRESA.

package TiposPrimitivos;

public class Teste03 {
    public static void main(String[] args) {
        int janeiro=15000;
        int fevereiro=23000;
        int marco=17000;
        int gastosTrimestre=janeiro+fevereiro+marco;
        System.out.println("O balanço trimestral da empresa: " + gastosTrimestre);
        //System.out.println("O balanço trimestral da empresa: " + (janeiro+fevereiro+marco));

        int mediaMensal=gastosTrimestre/3;
        System.out.println("valor da média mensal = " + mediaMensal);
    }
}
