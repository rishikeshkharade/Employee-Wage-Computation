import java.sql.SQLOutput;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.print("Welcome to Employee Wage Computation Program");
        final int FULL_TIME = 1;
        final int PART_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int WORKING_DAYS = 20;
        int total_wage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++) {
            int empType = (int) (Math.random() * 100) % 3;
            int workingHrs = 0;
            switch (empType) {
                case FULL_TIME:
                    System.out.println("Employee is Present");
                    workingHrs = 8;
                    break;

                case PART_TIME:
                    System.out.println("Employee is Present Part Time");
                    workingHrs = 4;
                    break;

                default:
                    System.out.println("Employee is Absent");
            }
            int wage = workingHrs * WAGE_PER_HR;
            System.out.println("Employee Daily Wage is " + wage);
            total_wage += wage;
        }
        System.out.println("Total wage for a month is " + total_wage);
    }
}