package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        system.addEmployee(new Employee("E001", "Alice", "Manager", 75000));
        system.addEmployee(new Employee("E002", "Bob", "Developer", 60000));
        system.addEmployee(new Employee("E003", "Charlie", "Designer", 50000));
        system.addEmployee(new Employee("E004", "David", "Tester", 55000));
        system.addEmployee(new Employee("E005", "Eve", "HR", 45000));

        System.out.println("All Employees:");
        system.traverseEmployees();

        Employee searchResult = system.searchEmployee("E003");
        System.out.println("\nSearch Result:");
        System.out.println(searchResult != null ? searchResult : "Employee not found");

        system.deleteEmployee("E004");
        System.out.println("\nEmployees after deletion:");
        system.traverseEmployees();
    }
}
