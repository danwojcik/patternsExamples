package patterns.behavioral.chain;

public class MyCompany {

    private AccessCheck accessCheck;

    public void setAccessCheck(AccessCheck check) {
        this.accessCheck = check;
    }

    public boolean enterRoom(String user) {
        if (accessCheck.doCheck(user)) {
            System.out.println("access granted for " + user);
            return true;
        }
        System.out.println("access denied for " + user);
        return false;
    }
}
