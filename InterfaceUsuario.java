public class InterfaceUsuario {
    private SistemaGerenciamentoFuncionarios sistema;

    public InterfaceUsuario(SistemaGerenciamentoFuncionarios sistema) {
        this.sistema = sistema;
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar Funcionário");
            System.out.println("2 - Remover Funcionário");
            System.out.println("3 - Listar Funcionários");
            System.out.println("4 - Buscar Funcionário");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Console.lerInt();

            switch (opcao) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    removerFuncionario();
                    break;
                case 3:
                    listarFuncionarios();
                    break;
                case 4:
                    buscarFuncionario();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    private void adicionarFuncionario() {
        System.out.println("Selecione o tipo de funcionário:");
        System.out.println("1 - Gerente");
        System.out.println("2 - Desenvolvedor");
        System.out.println("3 - Estagiário");
        System.out.print("Opção: ");
        int tipoFuncionario = Console.lerInt();
        switch (tipoFuncionario) {
            case 1:
                adicionarGerente();
                break;
            case 2:
                adicionarDesenvolvedor();
                break;
            case 3:
                adicionarEstagiario();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private void adicionarGerente() {
        System.out.print("Digite o nome do gerente: ");
        String nome = Console.lerString();
        System.out.print("Digite a matrícula do gerente: ");
        int matricula = Console.lerInt();
        System.out.print("Digite o bônus anual do gerente: ");
        float bonusAnual = Console.lerFloat();
        System.out.print("Digite a equipe do gerente: ");
        String equipe = Console.lerString();
        Gerente gerente = new Gerente(nome, matricula, bonusAnual, equipe);
        sistema.adicionarFuncionario(gerente);
        System.out.println("Gerente adicionado com sucesso!");
    }

    private void adicionarDesenvolvedor() {
        System.out.print("Digite o nome do desenvolvedor: ");
        String nome = Console.lerString();
        System.out.print("Digite a matrícula do desenvolvedor: ");
        int matricula = Console.lerInt();
        System.out.print("Digite a quantidade de tecnologias que domina: ");
        int qtdTecnologias = Console.lerInt();
        String[] tecnologias = new String[qtdTecnologias];
        for (int i = 0; i < qtdTecnologias; i++) {
            System.out.print("Digite a tecnologia " + (i+1) + ": ");
            tecnologias[i] = Console.lerString();
        }
        Desenvolvedor desenvolvedor = new Desenvolvedor(nome, matricula, tecnologias);
        sistema.adicionarFuncionario(desenvolvedor);
        System.out.println("Desenvolvedor adicionado com sucesso!");
    }

    private void adicionarEstagiario() {
        System.out.print("Digite o nome do estagiário: ");
        String nome = Console.lerString();
        System.out.print("Digite a matrícula do estagiário: ");
        int matricula = Console.lerInt();
        System.out.print("Digite as horas trabalhadas do estagiário: ");
        int horasTrabalhadas = Console.lerInt();
        System.out.print("Digite o supervisor do estagiário: ");
        String supervisor = Console.lerString();
        Estagiario estagiario = new Estagiario(nome, matricula, horasTrabalhadas, supervisor);
        sistema.adicionarFuncionario(estagiario);
        System.out.println("Estagiário adicionado com sucesso!");
    }

    private void removerFuncionario() {
        System.out.print("Digite a matrícula do funcionário a ser removido: ");
        int matricula = Console.lerInt();
        Funcionario funcionario = sistema.buscarFuncionarioPorMatricula(matricula);
        if (funcionario != null) {
            sistema.removerFuncionario(funcionario);
            System.out.println("Funcionário removido com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private void listarFuncionarios() {
        sistema.listarFuncionarios();
    }

    private void buscarFuncionario() {
        System.out.println("1 - Buscar por nome");
        System.out.println("2 - Buscar por matrícula");
        System.out.print("Escolha uma opção: ");
        int opcao = Console.lerInt();
        switch (opcao) {
            case 1:
                System.out.print("Digite o nome do funcionário: ");
                String nome = Console.lerString();
                Funcionario funcionarioPorNome = sistema.buscarFuncionarioPorNome(nome);
                if (funcionarioPorNome != null) {
                    System.out.println("Funcionário encontrado:");
                    System.out.println(funcionarioPorNome);
                } else {
                    System.out.println("Funcionário não encontrado.");
                }
                break;
            case 2:
                System.out.print("Digite a matrícula do funcionário: ");
                int matricula = Console.lerInt();
                Funcionario funcionarioPorMatricula = sistema.buscarFuncionarioPorMatricula(matricula);
                if (funcionarioPorMatricula != null) {
                    System.out.println("Funcionário encontrado:");
                    System.out.println(funcionarioPorMatricula);
                } else {
                    System.out.println("Funcionário não encontrado.");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}