public class Main {

    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Pedro", 3500);
        Gerente gen = new Gerente("André", 7000);

        imprimirSalarioComHoraExtra(dev, 10.0);
        imprimirSalarioComHoraExtra(gen, 10.0);
    }

    private static void imprimirSalarioComHoraExtra(Funcionario funcionario, double horasExtras) {
        try {
            double salarioTotal = funcionario.calcularHoraExtra(horasExtras);
            System.out.println("Meu nome é " + funcionario.getNome() + " e eu ganhei R$" + salarioTotal + " no total.");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}