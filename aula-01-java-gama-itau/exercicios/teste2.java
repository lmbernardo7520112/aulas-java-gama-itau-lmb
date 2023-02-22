package exercicios;
import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro N:");
        int N = scan.nextInt();

        int valor = 1;
        while (valor <= N) {
            System.out.print(valor + ", ");
            valor *= 2;
        }
    }
}