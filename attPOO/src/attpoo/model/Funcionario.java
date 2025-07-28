package attpoo.model;

public class Funcionario extends Pessoa {
    private String funcao;

    public Funcionario(int id, String nome, String funcao) {
        super(id, nome);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String getTipo() {
        return "Funcionário";
    }

    @Override
    public String toString() {
        return super.toString() + " - Função: " + funcao;
    }
}