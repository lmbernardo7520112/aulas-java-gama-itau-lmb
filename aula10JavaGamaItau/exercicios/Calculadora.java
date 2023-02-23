package aula10JavaGamaItau.exercicios;


import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;
        boolean opValida = false;
        while (!opValida) {
            System.out.print("Digite a operação desejada (+, -, *, /): ");
            String operacao = scanner.nextLine();
            if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {
                opValida = true;
                System.out.print("Digite o primeiro operando: ");
                double operando1 = scanner.nextDouble();
                System.out.print("Digite o segundo operando: ");
                double operando2 = scanner.nextDouble();
                switch (operacao) {
                    case "+":
                        resultado = operando1 + operando2;
                        break;
                    case "-":
                        resultado = operando1 - operando2;
                        break;
                    case "*":
                        resultado = operando1 * operando2;
                        break;
                    case "/":
                        try {
                            resultado = operando1 / operando2;
                        } catch (ArithmeticException e) {
                            System.out.println("Erro: divisão por zero!");
                            System.out.print("Digite um novo valor para o segundo operando: ");
                            operando2 = scanner.nextDouble();
                            resultado = operando1 / operando2;
                        }
                        break;
                }
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Operação inválida! Digite novamente.");
            }
            scanner.nextLine();
        }
        scanner.close();
    }

    public void somar(int i, int j) {
    }

    public void subtrair(int i, int j) {
    }

    public void multiplicar(int i, int j) {
    }

    public void dividir(int i, int j) {
    }
}

