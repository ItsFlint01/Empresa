public class Main {

    public static void main(String[] args) {

        sendOvertimeSalary(new Developer("Pedro", 3500), 10.0, 7.5);
        sendOvertimeSalary(new Manager("André", 7000), 10.0, 15);
    }

    private static void sendOvertimeSalary(Employee employee, double extraHours, double otValor) {
        try {
            double salarioTotal = employee.getOvertime(extraHours, otValor);
            System.out.println("Meu nome é " + employee.getName() + " e eu ganhei R$" + salarioTotal + " no total.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}