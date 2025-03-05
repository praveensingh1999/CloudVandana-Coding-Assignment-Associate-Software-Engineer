import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Id: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        // Create a list to store employees
        List<Employee> employees = new ArrayList<>();

        // Add employee objects to the list
        employees.add(new Employee(91, "Praveen", 50000));
        employees.add(new Employee(92, "Anup", 60000));
        employees.add(new Employee(93, "Suresh", 55000));

        // Display employee details
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
