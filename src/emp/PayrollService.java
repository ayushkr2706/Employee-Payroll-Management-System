package emp;

import java.util.ArrayList;
import java.util.Scanner;
 public class PayrollService {
    Scanner sc = new Scanner(System.in);
    ArrayList<Employee> employees;
    public PayrollService() {
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee e){
        employees.add(e);
    }
    public void removeEmployee(int id){
        Employee empToRemove = null;
        for(Employee e: employees){
            if(e.getId() == id){
                empToRemove = e;
            }
        }
        if(empToRemove != null){
            employees.remove(empToRemove);
        }
    }

    public void displayEmployees(){
        if(employees.isEmpty()){
            System.out.println("Employee List is Empty");
        }
        else {
            for (Employee e : employees) {
                System.out.println(e);
                System.out.println();
            }
        }
    }
}
