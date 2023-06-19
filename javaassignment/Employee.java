import java.util.Scanner;
class Employee{
    String firstName;
    String lastName; 
    float baseSalary;
    float bonus;

    Employee setEmployee(Employee employee){
        System.out.pri
    }

    public static void main(String args[]){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Employee :");
        n = scanner.nextInt();
        Employee[] employee = new Employee[n];
        for(int i =0 ;i < n; i++){
            employee[i] = new Employee();
        }

    }
}