package aula02JavaGamaItau.exemplos;

public class Proprietario {
    private String nome;
    private String telefone;

    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefona(String novoTelefone) {
        telefone = novoTelefone;
    }

}
