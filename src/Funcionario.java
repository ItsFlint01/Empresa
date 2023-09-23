public abstract class Funcionario {
    private final String nome;
    protected double salario;

    public String getNome() {
        return nome;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularHoraExtra(double hora);
}
