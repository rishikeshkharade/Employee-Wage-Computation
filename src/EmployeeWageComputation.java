public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.print("Welcome to Employee Wage Computation Program");
        final int FULL_TIME = 1;
        int empType = (int) (Math.random() * 100) % 2;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }

    }
}