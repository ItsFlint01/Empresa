public class Main {

    public static void main(String[] args) {

        sendOvertimeSalary(new Developer("Pedro", 3500), 10.0);
        sendOvertimeSalary(new Manager("André", 7000), 10.0);
    }

    private static void sendOvertimeSalary(Employee employee, double extraHours) {
        try {
            double totalSalary = employee.getOvertime(extraHours);
            System.out.println("Meu nome é " + employee.getName() + " e eu ganhei R$" + totalSalary + " no total.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getStackTrace());
        }
    }
}