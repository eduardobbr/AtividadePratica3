public class Desenvolvedor extends Funcionario {
    private String[] tecnologias;

    public Desenvolvedor(String nome, int matricula, String[] tecnologias) {
        super(nome, matricula);
        this.tecnologias = tecnologias;
    }

    @Override
    public float calcularSalario() {
        // Salário base para desenvolvedor
        float salarioBase = 3000.0f;

        // Adicional por tecnologia dominada
        float adicionalPorTecnologia = 100.0f;

        // Calcular o total do salário
        float salarioTotal = salarioBase + (tecnologias.length * adicionalPorTecnologia);

        return salarioTotal;
    }
}