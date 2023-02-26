package Homework;
public abstract class Employee {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Returns the amount of money to tbe paid to the employee counted in cents.
     * This means that the returned value is 100 times the weekly amount in euros.
     * @return The weekly salary of the employee counted in cents.
     */
    public abstract int getWeeklyPayroll();

    /**
     * Calculates and returns the amount of tax that the employer must pay for the employee every week.
     * @return The amount of tax that the employer must pay for the employee.
     */
    public int getTax() {
        return (int) (getWeeklyPayroll() * 0.1);
    }

    public String toString() {
        return "Name: " + name + ", Employee ID: " + employeeId + ", Weekly payroll: " + getWeeklyPayroll() + ", Tax: " + getTax();
    }
}