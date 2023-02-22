package exercicios;

public class teste {
    public static void main(String[] args) {
        int a = 10;
        int cont = 0;

        while (cont < 3) {
            cont++;
            a = a + cont;
        }

        System.out.println(a);
    }
}