package br.pucpr.prog4.lojaoldschool.models;

public class Produto {
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Number getPreço() {
        return preço;
    }

    public void setPreço(Number preço) {
        this.preço = preço;
    }
    private String nome;
    private Number preço;
    
}
