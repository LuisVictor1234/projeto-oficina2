package attpoo.model;


public class OrdemServico implements Identificavel {
    private int id;
    private Cliente cliente;
    private Veiculo veiculo;
    private Servico servico;
    private Funcionario funcionario;

    public OrdemServico(int id, Cliente c, Veiculo v, Servico s, Funcionario f) {
        this.id = id;
        this.cliente = c;
        this.veiculo = v;
        this.servico = s;
        this.funcionario = f;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Servico getServico() {
        return servico;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    @Override
    public String toString() {
        return "Ordem #" + id + " | " + cliente.getNome() + " | " + veiculo.getModelo() + " | " + servico.getDesc() + " | Resp: " + funcionario.getNome();
    }
}