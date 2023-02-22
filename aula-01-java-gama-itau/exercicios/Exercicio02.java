package exercicios;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double sal_min, valor_kw;
        double kw_energia, valorAPagar, valorComDesconto;
        

       

        System.out.println("Digite o valor salario mimnimo:");
        sal_min = entrada.nextInt();

        System.out.println("Digite quantidade Kw consumida:");
        kw_energia = entrada.nextInt();


        valor_kw = sal_min  / 500;
        //valorAPagar = kw_energia * valor_kw;
        //valorComDesconto= valorAPagar * 0.85;

        System.out.println("Um kw custa: " + valor_kw);

        entrada.close();

    }
}
