package exercicios.exercicio03;

public class ItemPedido {
    //atributos
        private int numeroItem;
        private String descricaoItem;
        private int quantidadeCompradaItem;
        private double precoUnitarioItem;

    //No construtor colocamos os atributos
    // public ItemPedido() {
    //     this.numeroItem = numeroItem;
    //     this.descricaoItem = descricaoItem;
    //     this.quantidadeCompradaItem = quantidadeCompradaItem;
    //     this.precoUnitarioItem = precoUnitarioItem;
    // }

    public ItemPedido(int numeroItem, String descricaoItem, int quantidadeCompradaItem, double precoUnitarioItem) {
        setDescricaoItem(descricaoItem);
        setNumeroItem(numeroItem);

    }


    

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }


    public void setQuantidadeCompradaItem(int quantidadeCompradaItem) {
        if (quantidadeCompradaItem > 0) {
            this.quantidadeCompradaItem = quantidadeCompradaItem;
        }
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public double getPrecoUnitarioItem() {
        return precoUnitarioItem;
    }

    public void setPrecoUnitarioItem(double precoUnitarioItem) {
        if (precoUnitarioItem > 0) {
            this.precoUnitarioItem = precoUnitarioItem;
        }
    }

    public int getQuantidadeCompradaItem() {
        return quantidadeCompradaItem;
    }

    public double getValorTotal() {
        return quantidadeCompradaItem * precoUnitarioItem;
    }
}
