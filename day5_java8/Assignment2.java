import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

class EmployeeStreamExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 28, 50000),
            new Employee("Bob", 35, 70000),
            new Employee("Charlie", 40, 80000),
            new Employee("David", 25, 45000),
            new Employee("Eve", 32, 75000)
        );

        // Filter employees older than 30
        List<String> employeeNames = employees.stream()
            .filter(e -> e.getAge() > 30)
            .map(Employee::getName)
            .collect(Collectors.toList());

        // Find the average salary of employees older than 30
        double averageSalary = employees.stream()
            .filter(e -> e.getAge() > 30)
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0);

        // Print results
        System.out.println("Employees older than 30: " + employeeNames);
        System.out.println("Average salary of employees older than 30: " + averageSalary);
    }
}
