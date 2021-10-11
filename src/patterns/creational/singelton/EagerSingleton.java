package patterns.creational.singelton;

public class EagerSingleton {

    private final int YEAR = 2000;

    private static final EagerSingleton ES_INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println(" utworzony obiekt klasy " + EagerSingleton.class.getName());
    }

    public static EagerSingleton getInstance() {

        System.out.println("jestem w getInstance()");

        return ES_INSTANCE;
    }

    public int getYEAR() {
        return YEAR;
    }
}
