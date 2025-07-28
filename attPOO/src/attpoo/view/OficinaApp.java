package attpoo.view;

import attpoo.util.GeradorIdVeiculo;
import attpoo.model.Cliente;
import attpoo.model.Funcionario;
import attpoo.model.OrdemServico;
import attpoo.model.Servico;
import attpoo.model.Produto;
import attpoo.model.Veiculo;
import attpoo.exception.RegistroNaoEncontradoException;
import attpoo.util.GeradorIdCliente;
import attpoo.util.GeradorIdFuncionario;
import attpoo.util.GeradorIdOrdemServico;
import attpoo.util.GeradorIdProduto;
import attpoo.util.GeradorIdServico;

import java.util.ArrayList;
import java.util.Scanner;

public class OficinaApp {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Veiculo> veiculos = new ArrayList<>();
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static ArrayList<Servico> servicos = new ArrayList<>();
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static ArrayList<OrdemServico> ordens = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            exibirMenuPrincipal();
            int op = lerInt("Escolha: ");
            if (op == 0) break;
            try {
                switch (op) {
                    case 1: crudCliente(); break;
                    case 2: crudVeiculo(); break;
                    case 3: crudFuncionario(); break;
                    case 4: crudServico(); break;
                    case 5: crudProduto(); break;
                    case 6: crudOrdem(); break;
                    default: System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        sc.close();
        System.out.println("Sistema encerrado.");
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\n========= SISTEMA DE GESTÃO DE OFICINA =========");
        System.out.println("1 - Tabela Cliente");
        System.out.println("2 - Tabela Veículo");
        System.out.println("3 - Tabela Funcionário");
        System.out.println("4 - Tabela Serviço");
        System.out.println("5 - Tabela Produto");
        System.out.println("6 - Tabela Ordem de Serviço");
        System.out.println("0 - Sair");
    }

    private static void crudCliente() {
        while (true) {
            try {
                System.out.println("\n1-Criar 2-Listar 3-Atualizar 4-Excluir 0-Voltar");
                int op = lerInt("");
                switch (op) {
                    case 0: return;
                    case 1:
                        String nome = lerStr("Nome: ");
                        String telefone = lerStr("Telefone: ");
                        clientes.add(new Cliente(GeradorIdCliente.novoId(), nome, telefone));
                        System.out.println("Cliente cadastrado!");
                        break;
                    case 2:
                        if (clientes.isEmpty()) System.out.println("Nenhum cliente.");
                        else clientes.forEach(System.out::println);
                        break;
                    case 3:
                        try {
                            int idA = lerInt("ID do cliente: ");
                            Cliente c = buscarPorId(clientes, idA);
                            c.nome = lerStr("Novo nome: ");
                            c.setTelefone(lerStr("Novo telefone: "));
                            System.out.println("Atualizado!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            int idR = lerInt("ID do cliente: ");
                            Cliente cRem = buscarPorId(clientes, idR);
                            clientes.remove(cRem);
                            System.out.println("Removido!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private static void crudVeiculo() {
        while (true) {
            try {
                System.out.println("\n1-Criar 2-Listar 3-Atualizar 4-Excluir 0-Voltar");
                int op = lerInt("");
                switch (op) {
                    case 0: return;
                    case 1:
                        String placa = lerStr("Placa: ");
                        String modelo = lerStr("Modelo: ");
                        veiculos.add(new Veiculo(GeradorIdVeiculo.novoId(), placa, modelo));
                        System.out.println("Veículo cadastrado!");
                        break;
                    case 2:
                        if (veiculos.isEmpty()) System.out.println("Nenhum veículo.");
                        else veiculos.forEach(System.out::println);
                        break;
                    case 3:
                        try {
                            int idA = lerInt("ID do veículo: ");
                            Veiculo v = buscarPorId(veiculos, idA);
                            v.setPlaca(lerStr("Nova placa: "));
                            v.setModelo(lerStr("Novo modelo: "));
                            System.out.println("Atualizado!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            int idR = lerInt("ID do veículo: ");
                            Veiculo vRem = buscarPorId(veiculos, idR);
                            veiculos.remove(vRem);
                            System.out.println("Removido!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private static void crudFuncionario() {
        while (true) {
            try {
                System.out.println("\n1-Criar 2-Listar 3-Atualizar 4-Excluir 0-Voltar");
                int op = lerInt("");
                switch (op) {
                    case 0: return;
                    case 1:
                        String nome = lerStr("Nome: ");
                        String funcao = lerStr("Função: ");
                        funcionarios.add(new Funcionario(GeradorIdFuncionario.novoId(), nome, funcao));
                        System.out.println("Funcionário cadastrado!");
                        break;
                    case 2:
                        if (funcionarios.isEmpty()) System.out.println("Nenhum funcionário.");
                        else funcionarios.forEach(System.out::println);
                        break;
                    case 3:
                        try {
                            int idA = lerInt("ID do funcionário: ");
                            Funcionario f = buscarPorId(funcionarios, idA);
                            f.nome = lerStr("Novo nome: ");
                            f.setFuncao(lerStr("Nova função: "));
                            System.out.println("Atualizado!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            int idR = lerInt("ID do funcionário: ");
                            Funcionario fRem = buscarPorId(funcionarios, idR);
                            funcionarios.remove(fRem);
                            System.out.println("Removido!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private static void crudServico() {
        while (true) {
            try {
                System.out.println("\n1-Criar 2-Listar 3-Atualizar 4-Excluir 0-Voltar");
                int op = lerInt("");
                switch (op) {
                    case 0: return;
                    case 1:
                        String desc = lerStr("Descrição: ");
                        double preco = lerDouble("Preço: ");
                        Servico servico = new Servico(GeradorIdServico.novoId(), desc, preco);

                        if (confirmar("Deseja relacionar um cliente ao serviço? (s/n): ") && !clientes.isEmpty()) {
                            clientes.forEach(System.out::println);
                            try {
                                int idC = lerInt("ID Cliente: ");
                                servico.setCliente(buscarPorId(clientes, idC));
                            } catch (Exception e) {
                                System.out.println("Erro: " + e.getMessage());
                            }
                        }
                        if (confirmar("Deseja relacionar um veículo ao serviço? (s/n): ") && !veiculos.isEmpty()) {
                            veiculos.forEach(System.out::println);
                            try {
                                int idV = lerInt("ID Veículo: ");
                                servico.setVeiculo(buscarPorId(veiculos, idV));
                            } catch (Exception e) {
                                System.out.println("Erro: " + e.getMessage());
                            }
                        }
                        if (confirmar("Deseja relacionar um funcionário ao serviço? (s/n): ") && !funcionarios.isEmpty()) {
                            funcionarios.forEach(System.out::println);
                            try {
                                int idF = lerInt("ID Funcionário: ");
                                servico.setFuncionario(buscarPorId(funcionarios, idF));
                            } catch (Exception e) {
                                System.out.println("Erro: " + e.getMessage());
                            }
                        }
                        servicos.add(servico);
                        System.out.println("Serviço cadastrado!");
                        break;
                    case 2:
                        if (servicos.isEmpty()) System.out.println("Nenhum serviço.");
                        else servicos.forEach(System.out::println);
                        break;
                    case 3:
                        try {
                            int idA = lerInt("ID do serviço: ");
                            Servico s = buscarPorId(servicos, idA);
                            s.setDesc(lerStr("Nova descrição: "));
                            s.setPreco(lerDouble("Novo preço: "));
                            System.out.println("Atualizado!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            int idR = lerInt("ID do serviço: ");
                            Servico sRem = buscarPorId(servicos, idR);
                            servicos.remove(sRem);
                            System.out.println("Removido!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private static void crudProduto() {
        while (true) {
            try {
                System.out.println("\n1-Criar 2-Listar 3-Atualizar 4-Excluir 0-Voltar");
                int op = lerInt("");
                switch (op) {
                    case 0: return;
                    case 1:
                        String desc = lerStr("Descrição: ");
                        double preco = lerDouble("Preço: ");
                        produtos.add(new Produto(GeradorIdProduto.novoId(), desc, preco));
                        System.out.println("Produto cadastrado!");
                        break;
                    case 2:
                        if (produtos.isEmpty()) System.out.println("Nenhum produto.");
                        else produtos.forEach(System.out::println);
                        break;
                    case 3:
                        try {
                            int idA = lerInt("ID do produto: ");
                            Produto p = buscarPorId(produtos, idA);
                            p.setDesc(lerStr("Nova descrição: "));
                            p.setPreco(lerDouble("Novo preço: "));
                            System.out.println("Atualizado!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            int idR = lerInt("ID do produto: ");
                            Produto pRem = buscarPorId(produtos, idR);
                            produtos.remove(pRem);
                            System.out.println("Removido!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private static void crudOrdem() {
        while (true) {
            try {
                System.out.println("\n1-Criar 2-Listar 3-Excluir 0-Voltar");
                int op = lerInt("");
                switch (op) {
                    case 0: return;
                    case 1:
                        if (clientes.isEmpty() || veiculos.isEmpty() || servicos.isEmpty() || funcionarios.isEmpty()) {
                            System.out.println("Cadastre cliente, veículo, serviço e funcionário antes.");
                            break;
                        }
                        System.out.println("Clientes:");
                        clientes.forEach(System.out::println);
                        try {
                            int idC = lerInt("ID Cliente: ");
                            Cliente c = buscarPorId(clientes, idC);

                            System.out.println("Veículos:");
                            veiculos.forEach(System.out::println);
                            int idV = lerInt("ID Veículo: ");
                            Veiculo v = buscarPorId(veiculos, idV);

                            System.out.println("Serviços:");
                            servicos.forEach(System.out::println);
                            int idS = lerInt("ID Serviço: ");
                            Servico s = buscarPorId(servicos, idS);

                            System.out.println("Funcionários:");
                            funcionarios.forEach(System.out::println);
                            int idF = lerInt("ID Funcionário: ");
                            Funcionario f = buscarPorId(funcionarios, idF);

                            s.setCliente(c);
                            s.setVeiculo(v);
                            s.setFuncionario(f);

                            ordens.add(new OrdemServico(GeradorIdOrdemServico.novoId(), c, v, s, f));
                            System.out.println("Ordem cadastrada!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    case 2:
                        if (ordens.isEmpty()) System.out.println("Nenhuma ordem.");
                        else ordens.forEach(System.out::println);
                        break;
                    case 3:
                        try {
                            int idR = lerInt("ID da ordem: ");
                            OrdemServico oRem = buscarPorId(ordens, idR);
                            ordens.remove(oRem);
                            System.out.println("Removida!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private static boolean confirmar(String msg) {
        System.out.print(msg);
        String resp = sc.nextLine();
        return resp.equalsIgnoreCase("s");
    }

    private static int lerInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                String entrada = sc.nextLine();
                return Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número inteiro.");
            }
        }
    }

    private static double lerDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                String entrada = sc.nextLine();
                return Double.parseDouble(entrada.replace(',', '.').trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número decimal.");
            }
        }
    }

    private static String lerStr(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    private static <T extends Identificavel> T buscarPorId(ArrayList<T> lista, int id) throws RegistroNaoEncontradoException {
        for (T obj : lista) if (obj.getId() == id) return obj;
        throw new RegistroNaoEncontradoException("ID não encontrado: " + id);
    }
}