package patterns.behavioral.templateMethod;

public abstract class NewsProvider {

    private String message;

    public abstract boolean authorize(String autorizationData);

    public final boolean sendMessage(String autorizationData) {

        System.out.println("message sent: " + message);
        return true;
    }

    public abstract boolean endConnect(String autorizationData);

    public final void provideNews(String autorizationData) {

        if(authorize(autorizationData)) {
            sendMessage(autorizationData);
            endConnect(autorizationData);
        }
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
