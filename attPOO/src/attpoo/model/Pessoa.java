package attpoo.model;

public abstract class Pessoa implements Identificavel {
    protected int id;
    protected String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return getTipo() + ": " + nome + " (ID: " + id + ")";
    }
}