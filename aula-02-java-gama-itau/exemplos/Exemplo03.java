package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        
        Carro carro = new Carro("BMW", "X1", 15.8);

        carro.modelo_marca();
        System.out.println("Consumo:"+ carro.obterConsumo());
    }
}
