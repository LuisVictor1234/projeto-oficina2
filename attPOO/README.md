# AttPOO - Sistema de Gestão de Oficina

Este projeto é um sistema de gestão para oficinas mecânicas, permitindo o gerenciamento de clientes, veículos, funcionários, serviços, produtos e ordens de serviço.

## Estrutura do Projeto

O projeto é organizado em pacotes, cada um contendo classes específicas para diferentes funcionalidades:

- **src/attpoo**: Contém a classe principal `Main.java`, que inicializa o aplicativo e gerencia o menu principal.
- **src/attpoo/exception**: Contém a classe `RegistroNaoEncontradoException.java`, que define uma exceção personalizada para casos em que um registro não é encontrado.
- **src/attpoo/model**: Contém as classes que representam os modelos de dados, incluindo `Cliente`, `Funcionario`, `Veiculo`, `Servico`, `Produto`, `OrdemServico` e a interface `Identificavel`.
- **src/attpoo/util**: Contém classes utilitárias para geração de IDs únicos para cada tipo de entidade.
- **src/attpoo/view**: Contém a classe `OficinaApp.java`, que gerencia a lógica da interface do usuário.

## Funcionalidades

O sistema permite as seguintes operações:

- **Clientes**: Criar, listar, atualizar e excluir clientes.
- **Veículos**: Criar, listar, atualizar e excluir veículos.
- **Funcionários**: Criar, listar, atualizar e excluir funcionários.
- **Serviços**: Criar, listar, atualizar e excluir serviços.
- **Produtos**: Criar, listar, atualizar e excluir produtos.
- **Ordens de Serviço**: Criar, listar e excluir ordens de serviço.

## Como Executar

1. Clone o repositório ou baixe os arquivos do projeto.
2. Abra o projeto em um ambiente de desenvolvimento Java.
3. Compile o projeto.
4. Execute a classe `Main` para iniciar o sistema.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

## Licença

Este projeto é licenciado sob a MIT License. Veja o arquivo LICENSE para mais detalhes.