package exercicios.exercicio03;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o vetor para armazenar as notas
        double[] notas = new double[10];

        // Lendo as notas dos alunos e armazenando no vetor
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Imprimindo todas as notas
        System.out.println("Notas dos alunos:");
        for (double nota : notas) {
            System.out.println(nota);
        }

        // Calculando a média da turma
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        System.out.println("Média da turma: " + media);

        // Contando a quantidade de notas acima da média e imprimindo as notas acima da média
        int qtdNotasAcimaMedia = 0;
        System.out.print("Notas acima da média: ");
        for (double nota : notas) {
            if (nota > media) {
                qtdNotasAcimaMedia++;
                System.out.print(nota + " ");
            }
        }
        System.out.println("\nQuantidade de notas acima da média: " + qtdNotasAcimaMedia);

        scanner.close();
    }

}
