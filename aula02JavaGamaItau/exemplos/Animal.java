package aula02JavaGamaItau.exemplos;

public class Animal {
    private String nome;
    private String raca;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal(String nome, String raca, int anoNascimento, Proprietario proprietario) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    

    
}