package aula02JavaGamaItau.exemplos;

public class AppFuncionario {
    
        public static void main(String[] args) {
            Funcionario funcionario1 = new Funcionario("João Silva", 160, 15);
            Funcionario funcionario2 = new Funcionario("Maria Oliveira", 180, 20);
    
            System.out.println("Dados do Funcionário 1:");
            funcionario1.exibirDados();
            System.out.println("---------------------");
    
            System.out.println("Dados do Funcionário 2:");
            funcionario2.exibirDados();
        }
}
    

