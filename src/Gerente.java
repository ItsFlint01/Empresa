public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularHoraExtra(double hora) {
        if (hora <= 0) {
            throw new IllegalArgumentException("A hora definida deve ser maior que 0.");
        }

        double valorHoraExtra = 15.0;
        salario += hora * valorHoraExtra;

        return salario;
    }
}
