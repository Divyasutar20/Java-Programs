import java.util.*;

class Student {
    int rollNo;
    String name;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // Consume the newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        sc.close();
    }

    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.getDetails();
        s.displayDetails();
    }
}
