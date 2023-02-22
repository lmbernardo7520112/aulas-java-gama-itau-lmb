package aula02JavaGamaItau.exemplos;

public class Carro {

    String marca;
    String modelo;
    private double consumo;

    

  public Carro(String marca, String modelo, double consumo) {
    this.modelo = modelo;
    this.marca = marca;
    this.consumo = consumo;
  }

  void modelo_marca() {
    System.out.println("A marca do carro é:" + marca + " o modelo é: " + modelo);
}
    
    double obterConsumo() {
        return consumo;
    }
}
