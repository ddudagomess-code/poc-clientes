package br.com.pocclientes;

public class Cliente {
    private int id;
    private String nome;
    private int desconto;
    private String genero = "nd";

    public Cliente(int id, String nome, int desconto) {
        this.id = id;
        this.nome = nome;
        this.desconto = Math.max(0, desconto);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = Math.max(0, desconto);
    }

    @Override
    public String toString() {
        return nome + "(" + id + ")(" + desconto + "%)";
    }
}
