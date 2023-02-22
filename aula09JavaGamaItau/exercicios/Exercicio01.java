package aula09JavaGamaItau.exercicios;
import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        FilaDePrioridade fila = new FilaDePrioridade();
        Scanner scanner = new Scanner(System.in);
        
        boolean continua = true;
        while (continua) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar pessoa normal");
            System.out.println("2 - Adicionar pessoa prioritária");
            System.out.println("3 - Atender próximo da fila");
            System.out.println("4 - Exibir fila");
            System.out.println("5 - Sair");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String nomeNormal = scanner.nextLine();
                    System.out.print("Digite o número da senha: ");
                    int senhaNormal = scanner.nextInt();
                    scanner.nextLine();
                    fila.adicionarPessoa(new Pessoa(nomeNormal, senhaNormal));
                    System.out.println("Pessoa adicionada com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o nome da pessoa: ");
                    String nomePrioritaria = scanner.nextLine();
                    System.out.print("Digite o número da senha: ");
                    int senhaPrioritaria = scanner.nextInt();
                    scanner.nextLine();
                    fila.adicionarPessoa(new Pessoa(nomePrioritaria, senhaPrioritaria));
                    System.out.println("Pessoa adicionada com sucesso.");
                    break;
                case 3:
                    fila.atenderProximo();
                    break;
                case 4:
                    fila.exibirFila();
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    continua = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            
            System.out.println();
        }
    }
}
