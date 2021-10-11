package patterns.structural.proxy;

import java.util.List;

public class CompanyEmployees {

   static List<String> employees;

    public CompanyEmployees() {
        this.employees = employees;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    public static boolean isEmployees(String username) {
        return employees.contains(username);
    }
}
