import java.time.LocalDate;
import java.time.LocalTime;

class Employee {
    private LocalTime clockInTime;
    private LocalTime clockOutTime;
    private static int nextID = 1000;
    private int employeeId;
    private final String name;
    private final int birthYear;
    private final String sex;
    private String position;
    private double hoursWorked;
    private double rate;

    public Employee() {
        this.name = "";
        this.birthYear = 0;
        this.sex = "";
        this.position = "";
        this.hoursWorked = 0;
        this.rate = 0;
        this.employeeId = getNextID();
    }

    public Employee(String name, int birthYear, String sex, String position, int hours) {
        this.name = name;
        this.birthYear = birthYear;
        this.sex = sex;
        this.position = position;
        this.hoursWorked = hours;
        this.rate = (position.equalsIgnoreCase("manager")) ? 5.0 : 3.0;
        this.employeeId = getNextID();
    }

    public Employee(String name, int birthYear, String sex, String position) {

        this.name = name;
        this.birthYear = birthYear;
        this.sex = sex;
        this.position = position;
        this.rate = (position.equalsIgnoreCase("manager")) ? 5.0 : 3.0;
        this.employeeId = getNextID(); }

    public int getEmployeeId() {
        return employeeId;
    }

    private static int getNextID() {
        return nextID++;
    }
    public String getName() {
        return name;
    }

    public int age() {
        return LocalDate.EPOCH.getYear()-birthYear;
    }

    public String getSex() {
        return sex;
    }

    public String getPosition() {
        return position;
    }

    public void displayEmployeeInformation() {
        System.out.println("Employee Information:");
        System.out.println("ID: " + getEmployeeId());
        System.out.println("Name: " + getName());
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Sex: " + sex);
        System.out.println("Position: " + position);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: $" + rate);
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRate() {
        return rate;
    }
    public LocalTime clockIn() {
        clockInTime = LocalTime.now();
        System.out.println(name + " clocked in at " + clockInTime);
        return clockInTime;
    }

    public LocalTime clockOut() {
        clockOutTime = LocalTime.now();
        System.out.println(name + " clocked out at " + clockOutTime);
        return clockOutTime;
    }

    public void calculateHoursWorkedPerDay() {
        if (clockInTime != null && clockOutTime != null) {
            double hoursWorkedToday = clockOutTime.getHour() - clockInTime.getHour();
            hoursWorked += hoursWorkedToday;
            System.out.println(name + " worked for " + hoursWorkedToday + " hours today.");
        } else {
            System.out.println(name + " has not both clocked in and out today.");
        }
    }
    public double calculateSalary() {
        double salary = hoursWorked * rate;
        System.out.println(name + "'s salary: $" + salary);
        return salary;
    }
    public void resetMonthlyValues() {
        // Reset monthly values for each employee
        System.out.println("Resetting  hours for employee: " + name);

        // Reset hoursWorked to 0
        this.hoursWorked = 0;

        System.out.println("Monthly values reset completed for employee: " + name);
}
}