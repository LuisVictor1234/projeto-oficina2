package attpoo.model;

public class Produto extends ServicoBase {
    public Produto(int id, String desc, double preco) {
        super(id, desc, preco);
    }

    @Override
    public String getCategoria() {
        return "Produto";
    }
}