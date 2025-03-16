import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0.0;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise() {
        this.monthlySalary *= 1.10;
    }
}

public class EmployeeTest {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first employee's first name: ");
        String firstName1 = scanner.next();
        System.out.print("Enter first employee's last name: ");
        String lastName1 = scanner.next();
        System.out.print("Enter first employee's monthly salary: ");
        double salary1 = scanner.nextDouble();
        System.out.print("Enter second employee's first name: ");
        String firstName2 = scanner.next();
        System.out.print("Enter second employee's last name: ");
        String lastName2 = scanner.next();
        System.out.print("Enter second employee's monthly salary: ");
        double salary2 = scanner.nextDouble();
        scanner.close();
        Employee emp1 = new Employee(firstName1, lastName1, salary1);
        Employee emp2 = new Employee(firstName2, lastName2, salary2);
        System.out.println("\nInitial Yearly Salaries:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": " + emp2.getYearlySalary());
        emp1.giveRaise();
        emp2.giveRaise();
         System.out.println("\nYearly Salaries after 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": " + emp2.getYearlySalary()); } }

{

}
