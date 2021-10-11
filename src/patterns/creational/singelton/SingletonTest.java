package patterns.creational.singelton;

public class SingletonTest {

    public static void main(String[] args) {

        //najpierw, przy uruchomieniu bedzie utworzony obiekt klasy Eager singleton
        System.out.println("=====");

        EagerSingleton .getInstance();

        LazySingleton.getInstance();

        //wolanie innych metod na Singletonach
        EagerSingleton.getInstance().getYEAR();

        EagerSingleton localEagerSingleton = EagerSingleton.getInstance();

        localEagerSingleton.getYEAR();
    }
}
