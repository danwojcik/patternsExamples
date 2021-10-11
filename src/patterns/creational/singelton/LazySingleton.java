package patterns.creational.singelton;

public class LazySingleton {

    private  static LazySingleton LS_INSTANCE;

    private LazySingleton() {
        System.out.println("lazy singleton initialized " + LazySingleton.class.getName());
    }

    public static LazySingleton getInstance() {

        System.out.println("lazy singleton getInstance() called");

        if(LS_INSTANCE == null) {
            LS_INSTANCE = new LazySingleton();
        }
        return LS_INSTANCE;
    }
}
