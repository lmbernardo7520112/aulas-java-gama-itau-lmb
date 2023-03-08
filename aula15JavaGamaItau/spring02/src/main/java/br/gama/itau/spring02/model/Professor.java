package br.gama.itau.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //a classe será armazenada no BD
@Table(name = "professor") //indic o nome da tabela no BD
public class Professor {

    @Id //indica que o atributo é PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //será gerado sequencialmente (1, 2, 3, ...)
    @Column(name = "cod") //troca o nome da coluna na tabela (se for camelCase trocar para camel_case)
    private long codigo;
    @Column(length = 200, nullable = false) //tamanho maximo, e nome obrigatorio
    private String nome;
    @Column(length = 200, nullable = false, unique = true)
    private String email;
    
    // Construtor
    /*public Professor(long codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }*/

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
