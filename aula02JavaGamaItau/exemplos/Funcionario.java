package aula02JavaGamaItau.exemplos;

public class Funcionario {
        private String nome;
        private double horasTrabalhadas;
        private double valorPorHora;
    
        public Funcionario(String nome, double horasTrabalhadas, double valorPorHora) {
            this.nome = nome;
            this.horasTrabalhadas = horasTrabalhadas;
            this.valorPorHora = valorPorHora;
        }
    
        public double calcularSalario() {
            return horasTrabalhadas * valorPorHora;
        }
    
        public void exibirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
            System.out.println("Valor por Hora: " + valorPorHora);
            System.out.println("Salário: " + calcularSalario());
        }
    
    
}
