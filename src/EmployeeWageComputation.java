public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        computeEmployeewage("Company QK",20,20,100);
        computeEmployeewage("Company Wipro",25,22,120);
        computeEmployeewage("Company Infosys",18,25,110);
}

    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;

    public static void computeEmployeewage(String companyName, int WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_WORKING_HRS) {
        int total_wage = 0;
        int workingHrs = 0;

        System.out.println("\nComputing wages for "+companyName);
        for (int day = 1, totalworkingHrs = 0; day <= MAX_WORKING_DAYS && totalworkingHrs < MAX_WORKING_HRS; day++) {
            int empType = (int) (Math.random() * 100) % 3;

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
                    workingHrs = 0;
            }
            int wage = workingHrs * WAGE_PER_HR;
            System.out.println("Employee Daily Wage is " + wage);
            total_wage += wage;
            totalworkingHrs += workingHrs;
            System.out.println("Day= " + day + ", WorkingHrs= " + workingHrs + ", Wage= " + wage + ", Total Working Hrs= " + totalworkingHrs);
        }
        System.out.println("Total wage for a month is " + total_wage);
    }
}