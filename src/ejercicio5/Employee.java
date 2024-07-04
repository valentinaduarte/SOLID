package ejercicio5;

public class Employee {
    private String name;
    private static double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        Employee.salary = salary;
    }

    public String getName() {
        return name;
    }

    public static double getSalary() {
        return salary;
    }
} 