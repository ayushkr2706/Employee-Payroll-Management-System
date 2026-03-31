package emp;
public abstract class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;

    }

    @Override
    public String toString() {
        return "Employee Name: " + name +
                ", ID: " + id +
                ", Salary: " + getSalary();
    }
    public abstract double getSalary();

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

}
