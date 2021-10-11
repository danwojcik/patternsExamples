package patterns.structural.proxy;

public class PublicCompanyInternetNetwork implements CompanyInternetNetwork {

    public String username;

    public PublicCompanyInternetNetwork(String username) {
        this.username = username;
    }

    @Override
    public void getAccess(String username) {
        System.out.println("access granted to public networ for " + username);
    }
}
