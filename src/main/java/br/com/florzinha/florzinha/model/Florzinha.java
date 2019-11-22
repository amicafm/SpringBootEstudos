package br.com.florzinha.florzinha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Florzinha {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cor;

    public Florzinha() {}

    public Florzinha(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
