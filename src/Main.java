import emp.FullTimeEmployee;
import emp.PartTimeEmployee;
import emp.PayrollService;
import emp.Employee;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PayrollService ps = new PayrollService();
        PartTimeEmployee pt[] = new PartTimeEmployee[10];
        FullTimeEmployee ft[] = new FullTimeEmployee[10];
        int ptCounter = 0;
        int ftCounter = 0;
        while(true){
            System.out.println("*** Welcome to Payroll System ***");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Remove Employee");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Employee Type(1.Part-Time  2.Full-Time : ");
                    int type = sc.nextInt();
                    sc.nextLine();
                    if(type==1){
                       System.out.println("Enter Employee Name : ");
                       String name = sc.nextLine();
                       System.out.println("Enter Employee Id : ");
                       int id = sc.nextInt();
                        sc.nextLine();
                       System.out.println("Enter Hours Worked : ");
                       int hoursWorked = sc.nextInt();
                        sc.nextLine();
                       System.out.println("Enter Hourly Rate : ");
                       int hourlyRate = sc.nextInt();
                        sc.nextLine();
                        pt[ptCounter] = new PartTimeEmployee(name, id, hoursWorked, hourlyRate);
                        ps.addEmployee(pt[ptCounter]);
                        ptCounter++;
                    }
                    else if (type==2){
                        System.out.println("Enter Employee Name : ");
                        String name = sc.nextLine();
                        System.out.println("Enter Employee Id : ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Monthly Salary : ");
                        double monthlySalary = sc.nextDouble();
                        ft[ftCounter] = new FullTimeEmployee(name, id , monthlySalary);
                        ps.addEmployee(ft[ftCounter]);
                        ftCounter++;
                    }

                   break;

                    case 2:
                        ps.displayEmployees();
                        break;

                    case 3:
                        System.out.println("Enter Employee Id to be removed: ");
                        int id = sc.nextInt();
                        ps.removeEmployee(id);
                        System.out.println("Employee removed");
                        ps.displayEmployees();
                        break;

                case 4:
                    System.exit(0);
            }
        }
    }
}