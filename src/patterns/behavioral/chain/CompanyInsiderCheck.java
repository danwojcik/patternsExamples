package patterns.behavioral.chain;

public class CompanyInsiderCheck extends AccessCheck {

    @Override
    public boolean doCheck(String username) {

        System.out.println("companyInsider check for " + username);

        if (Employees.checkEmployee(username)) {

            System.out.println("companyInsider check PASSED for " + username);
            return checkNextElemnet(username);
        }
        System.out.println("companyInsider check FAILED for " + username);
        return false;
    }
}
