package aula09JavaGamaItau.exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDePrioridade {
    
    private Queue<Pessoa> filaNormal;
    private Queue<Pessoa> filaPrioridade;
    private int atendidosNormal;
    private int atendidosPrioridade;
    
    public FilaDePrioridade() {
        filaNormal = new LinkedList<>();
        filaPrioridade = new LinkedList<>();
        atendidosNormal = 0;
        atendidosPrioridade = 0;
    }
    
    public void adicionarPessoa(Pessoa pessoa) {
        if (pessoa.getSenha() % 2 == 0) { // se a senha for par, é de prioridade
            filaPrioridade.add(pessoa);
        } else { // senão, é normal
            filaNormal.add(pessoa);
        }
    }
    
    public void atenderProximo() {
        if (!filaPrioridade.isEmpty()) { // atende duas pessoas de prioridade
            System.out.println("Atendendo: " + filaPrioridade.remove().getNome());
            atendidosPrioridade++;
            if (!filaPrioridade.isEmpty()) {
                System.out.println("Atendendo: " + filaPrioridade.remove().getNome());
                atendidosPrioridade++;
            }
        } else if (!filaNormal.isEmpty()) { // se não há mais pessoas de prioridade, atende uma normal
            System.out.println("Atendendo: " + filaNormal.remove().getNome());
            atendidosNormal++;
        } else {
            System.out.println("Não há mais pessoas na fila.");
        }
    }
    
    public void exibirFila() {
        System.out.println("Fila de Prioridade:");
        for (Pessoa p : filaPrioridade) {
            System.out.println("Senha " + p.getSenha() + " - " + p.getNome());
        }
        System.out.println("Fila Normal:");
        for (Pessoa p : filaNormal) {
            System.out.println("Senha " + p.getSenha() + " - " + p.getNome());
        }
        System.out.println("Atendidos: " + atendidosPrioridade + " prioritários e " + atendidosNormal + " normais.");
    }
    
}
