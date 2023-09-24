public abstract class Employee {
    private final String name;
    private final double salary;

    public double getSalary() {
        return salary;
    }

    public int getOvertimeValor() {
        return overtime;
    }

    public void setOvertimeValor(int overtime) {
        this.overtime = overtime;
    }

    private int overtime;

    public String getName() {
        return name;
    }

    protected Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getOvertime(double hours) {
        if (hours <= 0) {
            throw new IllegalArgumentException("A hora definida deve ser maior que 0.");
        }

        double valor = salary + (hours * getOvertimeValor());

        return valor;
    }

}
