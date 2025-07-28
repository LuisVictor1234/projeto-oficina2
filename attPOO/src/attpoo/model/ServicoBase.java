package attpoo.model;

public abstract class ServicoBase implements Identificavel {
    protected int id;
    protected String desc;
    protected double preco;

    public ServicoBase(int id, String desc, double preco) {
        this.id = id;
        this.desc = desc;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract String getCategoria();

    @Override
    public String toString() {
        return getCategoria() + ": " + desc + " - R$" + preco + " (ID: " + id + ")";
    }
}