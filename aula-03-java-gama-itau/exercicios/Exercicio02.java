package exercicios;

import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        final int QTDE_SORTEIOS = 10;
        Random aleatorio = new Random();

        int cont[] = new int[7];
        int numeroSorteado;

        for (int i=0; i < QTDE_SORTEIOS; i++) {
        //for(int sorteio : cont) {
            numeroSorteado = aleatorio.nextInt(6) + 1;
            System.out.println(numeroSorteado);
        }

        System.out.println(aleatorio.nextInt(1,7));
    }
}
