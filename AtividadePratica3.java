public class AtividadePratica3 {
    public static void main(String[] args) {
        SistemaGerenciamentoFuncionarios sistema = new SistemaGerenciamentoFuncionarios();
        InterfaceUsuario menu = new InterfaceUsuario(sistema);
        menu.exibirMenu();
    }
}
