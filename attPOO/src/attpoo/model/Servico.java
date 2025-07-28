package attpoo.model;


public class Servico extends ServicoBase {
    private Cliente cliente;
    private Veiculo veiculo;
    private Funcionario funcionario;

    public Servico(int id, String desc, double preco) {
        super(id, desc, preco);
    }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }

    public Funcionario getFuncionario() { return funcionario; }
    public void setFuncionario(Funcionario funcionario) { this.funcionario = funcionario; }

    @Override
    public String getCategoria() { return "Serviço"; }

    @Override
    public String toString() {
        String rel = "";
        if (cliente != null) rel += " | Cliente: " + cliente.getNome();
        if (veiculo != null) rel += " | Veículo: " + veiculo.getModelo();
        if (funcionario != null) rel += " | Funcionário: " + funcionario.getNome();
        return super.toString() + rel;
    }
}