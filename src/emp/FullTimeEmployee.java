package emp;

 public class FullTimeEmployee extends Employee {

    double monthlySalary;
    public FullTimeEmployee(String name, int id, double salary) {

        super(name, id);
        this.monthlySalary = salary;
    }
    @Override
    public double getSalary() {
        return monthlySalary;
    }
}
