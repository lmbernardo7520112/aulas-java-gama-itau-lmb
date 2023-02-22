package exercicios.exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        ItemPedido item = new ItemPedido(56, "mouse", 5, 67.8);
    
        System.out.println("Produto:");
        System.out.printf("%d - %s %d R$%.2f\n", item.getNumeroItem(), item.getDescricaoItem(), item.getQuantidadeCompradaItem(), item.getPrecoUnitarioItem());
        System.out.printf("Valor Total: R$ %.2f\n", item.getValorTotal());
    
    
    }



}
