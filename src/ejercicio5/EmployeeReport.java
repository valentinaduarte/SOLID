package ejercicio5;

public class EmployeeReport {
    public void generateReport(Employee employee) {
        // Lógica para generar el reporte del empleado
        System.out.println("Employee Report:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + Employee.getSalary());
        // Puedes agregar más detalles al reporte según sea necesario
    }
    
}
