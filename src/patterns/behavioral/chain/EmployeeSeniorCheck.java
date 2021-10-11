package patterns.behavioral.chain;

public class EmployeeSeniorCheck extends AccessCheck {

    private int MINIMUM_ACCESS_LEVEL = 10;

    @Override
    public boolean doCheck(String username) {

        System.out.println("employeeSeniorCheck for " + username);

        if (Employees.checkEmployeeLevel(username) >= MINIMUM_ACCESS_LEVEL) {

            System.out.println("EmployeeSeniorityCheck PASSED for " + username);
            return  checkNextElemnet(username);
        }
        System.out.println("employeeSeniorityCheck FAILED for " + username);
        return false;
    }
}
