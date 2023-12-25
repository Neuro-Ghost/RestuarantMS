import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeManager {
    private LinkedList<Employee> employees;
    public EmployeeManager() {
        this.employees = new LinkedList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee.getName() + ", ID: " + employee.getEmployeeId());
    }

    public void removeEmployee(int employeeId) {
        ListIterator<Employee> iterator = employees.listIterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmployeeId() == employeeId) {
                if ("manager".equalsIgnoreCase(employee.getPosition())) {
                    System.out.println("Managers cannot be removed, consult with HR. ID: " + employeeId);
                } else {
                    iterator.remove();
                    System.out.println("Employee removed: " + employee.getName() + ", ID: " + employeeId);
                }
                return;
            }
        }
        System.out.println("Employee not found: ID " + employeeId);
    }


    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
        }
        return totalSalary;
    }

    public Employee findEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public void displayAllEmployees() {
        System.out.println("All Employees:");
        for (Employee employee : employees) {
           employee.displayEmployeeInformation();
        }
        System.out.println();
    }

    public void displayEmployeesByPosition(String position) {
        System.out.println("Employees with Position '" + position + "':");
        for (Employee employee : employees) {
            if (employee.getPosition().equalsIgnoreCase(position)) {
                employee.displayEmployeeInformation();
            }
        }
        System.out.println();
    }

    public void resetMonthlyValuesForAllEmployees() {
        // Iterate through all employees and reset monthly values
        for (Employee employee : employees) {
            employee.resetMonthlyValues();
        }
        System.out.println("Monthly reset completed for all employees.");
    }

}
