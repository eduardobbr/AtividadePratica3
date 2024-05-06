public class Gerente extends Funcionario {
    private float bonusAnual;
    private String equipe;

    public Gerente(String nome, int matricula, float bonusAnual, String equipe) {
        super(nome, matricula);
        this.bonusAnual = bonusAnual;
        this.equipe = equipe;
    }

    public String getEquipe() {
        return equipe;
    }

    @Override
    public float calcularSalario() {
        // Salário do gerente é composto pelo salário base mais o bônus anual
        float salarioBase = 5000.0f;
        return salarioBase + bonusAnual;
    }
}