package Homework;

import java.util.Scanner;

public class Main {


    public static class SalariedEmployee extends Employee {//长期雇员类:用于记录员工的薪水是多少,同时根据员工的工资数来计算每周的payroll cost
        private int weeklySalary;

        public SalariedEmployee(String name, String employeeId, int weeklySalary) {
            super(name, employeeId);
            this.weeklySalary = weeklySalary;
        }

        @Override
        public int getWeeklyPayroll() {
            return this.weeklySalary;
        }
    }


    public static class HourlyPaidEmployee extends Employee {//钟点工类:能够记住员工每小时的薪水;可记录员工每周工作的时长(多少小时);上述的数值可以用于计算雇员的weekly payroll cost
        private int workTime;
        private int HourlySalary;

        public HourlyPaidEmployee(String name, String employeeId, int HourlySalary, int workTime) {
            super(name, employeeId);
            this.HourlySalary = HourlySalary;
            this.workTime = workTime;
        }

        @Override
        public int getWeeklyPayroll() {
            return (this.workTime * this.HourlySalary);
        }
    }


    public static class Contractor extends Employee {//承包商类:它是雇员类中比较特殊的一个,公司不需要为承包商支付tax,只需要为承包商提供的服务买单即可
        private int weeklySalary;

        public Contractor(String name, String employeeId, int weeklySalary) {
            super(name, employeeId);
            this.weeklySalary = weeklySalary;
        }

        @Override
        public int getWeeklyPayroll() {
            return this.weeklySalary;
        }

        @Override
        public int getTax() {
            return 0;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[100];
        int index = 0;
        while( scanner.hasNext()){
            String line = scanner.nextLine();
            if (line.startsWith("Salary")){
                String[] parts = line.split(" ");
                SalariedEmployee salariedEmployee = new SalariedEmployee(parts[1], parts[2], Integer.parseInt(parts[3]));
                employees[index] = salariedEmployee;
                index++;
            } else if (line.startsWith("Hourly")){
                String[] parts = line.split(" ");
                HourlyPaidEmployee hourlyPaidEmployee = new HourlyPaidEmployee(parts[1], parts[2], Integer.parseInt(parts[3]), Integer.parseInt(parts[4]));
                employees[index] = hourlyPaidEmployee;
                index++;
            } else if (line.startsWith("Contractor")){
                String[] parts = line.split(" ");
                Contractor contractor = new Contractor(parts[1], parts[2], Integer.parseInt(parts[3]));
                employees[index] = contractor;
                index++;
            }
        }



        PayrollSystem calculater = new PayrollSystem();
        System.out.println("Total weekly payroll: " + calculater.calculateTotalWeeklyPayroll(employees));
        System.out.println("Total weekly tax: " + calculater.calculateTotalWeeklyTax(employees));
    }
}
