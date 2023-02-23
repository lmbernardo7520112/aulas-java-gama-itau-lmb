package exercicios;

import java.util.Scanner;
public class Exercicio01 {
	
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota_1;
        double nota_2;
        double media;
    
        System.out.println("Digite a primeira nota:");
        nota_1 = entrada.nextDouble();
    
        System.out.println("Digite a segunda nota:");
    
        nota_2 = entrada.nextDouble();
    
        media = (nota_1 + nota_2)/2;
    
        System.out.println("A media é:" + media);
        entrada.close();
    }
}