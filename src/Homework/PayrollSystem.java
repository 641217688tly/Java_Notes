package Homework;

public class PayrollSystem {
    public int calculateTotalWeeklyPayroll(Employee[] employees) {
        int total = 0;
        for (Employee employee : employees) {
            total += employee.getWeeklyPayroll();
        }
        return total;
    }

    public int calculateTotalWeeklyTax(Employee[] employees) {
        int total = 0;
        for (Employee employee : employees) {
            total += employee.getTax();
        }
        return total;
    }
}