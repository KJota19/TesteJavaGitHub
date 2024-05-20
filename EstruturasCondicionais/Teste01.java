//MAIOR DE IDADE

package EstruturasCondicionais;

public class Teste01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida){
            System.out.println("autorizado a comprar bebidas alcolica");
        }else{
            System.out.println("não autorizado a comprar bebida alcólica");   
        }
    }
}
