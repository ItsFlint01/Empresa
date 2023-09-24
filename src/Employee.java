public abstract class Employee {
    private final String name;
    private final double salary;

    public String getName() {
        return name;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getOvertime(double hours, double otvalor) {
        if (hours <= 0) {
            throw new IllegalArgumentException("A hora definida deve ser maior que 0.");
        }

        double valor = salary + (hours * otvalor);

        return valor;
    }

}
