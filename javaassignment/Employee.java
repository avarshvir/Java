import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private int baseSalary;
    private int bonus;

    Employee(String firstName, String lastName, int baseSalary, int bonus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public int calculateSalary(int month) {
        int Days_31 = 31;
        int Days_30 = 30;
        int feb_days = 28;
        if (month % 2 != 0 && feb_days == 0) {
            
            return (Days_31*baseSalary) + bonus;
        } else {
            return baseSalary;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employee in the company: ");
        int numEmployees = scanner.nextInt();

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter the information of employee " + (i + 1));

            System.out.println("Enter the first name: ");
            String firstName = scanner.next();

            System.out.println("Enter the last name: ");
            String lastName = scanner.next();

            System.out.println("Enter the base salary: ");
            int baseSalary = scanner.nextInt();

            System.out.println("Enter the bonus: ");
            int bonus = scanner.nextInt();

            employees[i] = new Employee(firstName, lastName, baseSalary, bonus);
        }

        System.out.println("Enter the month of which you want to calculate salary: ");
        int month = scanner.nextInt();

        for (Employee employee : employees) {
            int salary = employee.calculateSalary(month);
            System.out.println("Salary of " + employee.firstName + " with " + employee.bonus + " bonus is " + salary);
        }
    }
}
