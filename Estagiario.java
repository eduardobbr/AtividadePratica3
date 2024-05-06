public class Estagiario extends Funcionario {
    private int horasTrabalhadas;
    private String supervisor;

    public Estagiario(String nome, int matricula, int horasTrabalhadas, String supervisor) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    @Override
    public float calcularSalario() {
        // Salário do estagiário é calculado com base nas horas trabalhadas
        float salarioPorHora = 10.0f;
        return salarioPorHora * horasTrabalhadas;
    }
}