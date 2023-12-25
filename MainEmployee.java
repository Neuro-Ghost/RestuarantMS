import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {
        EmployeeManager EmpManager= new EmployeeManager();
        Employee manager1 = new Employee("Manager Alice", 1985, "Female", "manager", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(manager1);

        Employee manager2 = new Employee("Manager Bob", 1980, "Male", "Manager", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(manager2);

        Employee manager3 = new Employee("Manager Carol", 1978, "Female", "Manager", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(manager3);

// Adding 12 Random Employees
        Employee waiter1 = new Employee("Waiter Dave", 1992, "Male", "Waiter", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(waiter1);

        Employee waiter2 = new Employee("Waitress Eve", 1995, "Female", "Waiter", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(waiter2);

        Employee cashier = new Employee("Cashier Frank", 1988, "Male", "Cashier", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(cashier);

        Employee kitchenStaff1 = new Employee("Cook Grace", 1982, "Female", "Kitchen Staff", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(kitchenStaff1);

        Employee kitchenStaff2 = new Employee("Chef Henry", 1975, "Male", "Chef", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(kitchenStaff2);

        Employee employee6 = new Employee("Employee6", 1990, "Female", "Waiter", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(employee6);

        Employee employee7 = new Employee("Employee7", 1987, "Male", "Kitchen Staff", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(employee7);

        Employee employee8 = new Employee("Employee8", 1983, "Female", "Waiter", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(employee8);

// Adding more employees with realistic hours
        Employee employee9 = new Employee("Employee9", 1989, "Male", "Kitchen Staff", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(employee9);

        Employee employee10 = new Employee("Employee10", 1986, "Female", "Waiter", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(employee10);

        Employee employee11 = new Employee("Employee11", 1984, "Male", "Kitchen Staff", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(employee11);

        Employee employee12 = new Employee("Employee12", 1993, "Female", "Waiter", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(employee12);

        Employee employee13 = new Employee("Employee13", 1991, "Male", "Kitchen Staff", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(employee13);

        Employee employee14 = new Employee("Employee14", 1981, "Female", "Waiter", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(employee14);

        Employee employee15 = new Employee("Employee15", 1979, "Male", "Kitchen Staff", 160); // Assuming 160 hours per month
        EmpManager.addEmployee(employee15);

        Scanner scanner = new Scanner(System.in);


        // A loop to keep asking for operations until the user enters -1
        int choice;
        boolean isManager = false;  // Flag to check if the user is a manager

        // Assuming you have a method to check if the employee is a manager
        System.out.println("Enter your employee ID: ");
        int employeeId = scanner.nextInt();
        Employee employee = EmpManager.findEmployeeById(employeeId);

        if (employee != null) {
            isManager = "manager".equalsIgnoreCase(employee.getPosition());
        }

        while (isManager) {
            // Display operations for the manager
            System.out.println("Operations for the manager:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Display Employees By Position");
            System.out.println("5. View Salaries for Employees");
            System.out.println("6. Find Employee By ID");
            System.out.println("7. Reset Monthly Values for All Employees");
            System.out.println("0. Exit");
            System.out.println("Enter your choice (0-7): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Employee
                    System.out.println("Enter employee details:");
                    System.out.println("Name: ");
                    String name = scanner.next();
                    System.out.println("Birth Year: ");
                    int birthYear = scanner.nextInt();
                    System.out.println("Sex: ");
                    String sex = scanner.next();
                    System.out.println("Position: ");
                    String position = scanner.next();

                    // Create an employee and add to the manager
                    Employee newEmployee = new Employee(name, birthYear, sex, position);
                    EmpManager.addEmployee(newEmployee);
                    break;

                case 2:
                    // Remove Employee
                    System.out.println("Enter employee ID to remove: ");
                    int removeEmployeeId = scanner.nextInt();
                    EmpManager.removeEmployee(removeEmployeeId);
                    break;

                case 3:
                    // Display All Employees
                    EmpManager.displayAllEmployees();
                    break;

                case 4:
                    // Display Employees By Position
                    System.out.println("Enter position to display employees: ");
                    String displayPosition = scanner.next();
                    EmpManager.displayEmployeesByPosition(displayPosition);
                    break;

                case 5:
                    // View Salaries for Employees
                    System.out.println("Viewing salaries for all employees:");
                    double totalSalary = EmpManager.calculateTotalSalary();
                    System.out.println("Total Salary for all employees: $" + totalSalary);
                    break;

                case 6:
                    // Find Employee By ID
                    System.out.println("Enter employee ID to find: ");
                    int findEmployeeId = scanner.nextInt();
                    Employee foundEmployee = EmpManager.findEmployeeById(findEmployeeId);
                    if (foundEmployee != null) {
                        System.out.println("Employee found: " + foundEmployee.getName());
                    } else {
                        System.out.println("Employee not found with ID " + findEmployeeId);
                    }
                    break;

                case 7:
                    // Reset Monthly Values for All Employees
                    EmpManager.resetMonthlyValuesForAllEmployees();
                    break;

                case 0:
                    // Exit for the manager
                    System.out.println("Exiting the program. Goodbye!");
                    return;  // Exit the program

                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 7.");
                    break;
            }
        }

        // Display info for non-manager employees
        if (employee != null) {
            employee.displayEmployeeInformation();
            // Display other relevant information
        } else {
            System.out.println("Employee not found with ID " + employeeId);
        }

        // Close the scanner
        scanner.close();
    }
    }
