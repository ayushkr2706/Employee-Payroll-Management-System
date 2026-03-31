package emp;

 public class PartTimeEmployee extends Employee {
    public int hoursWorked;
    public int hourlyRate;
    public PartTimeEmployee(String name, int id, int hoursWorked, int hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double getSalary() {
        return hoursWorked * hourlyRate;
    }
}
