package exercicios;


import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Introduzindo o dado
       double salario;
       //double taxa;
       //boolean valida;

        System.out.println("Informe o salario");
        salario = teclado.nextDouble();
        
        //valida = senha.equals("R10p5");
        //valida = senha.equalsIgnoreCase("R10p5");
    
        if ( salario <= 600.00 ) {
            System.out.println("Isento");
            } else {
                if ( salario <= 1200.00 ) {
                    System.out.println("Taxa de 20%");
                } else { 
                    if ( salario <= 2000.00 ) {
                    System.out.println("Taxa de 25%");
                } else {
                    System.out.println("Taxa de 30%");
                }
            }
        }
    
        System.out.println("Fim de execução");

        teclado.close();
    }
}
