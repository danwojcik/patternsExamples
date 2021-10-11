package patterns.creational.abstractFactory;

public class FordFiesta extends Ford {

    private String name;
    private String engine;
    private String addons;

    public FordFiesta(String name, String engine, String addons) {
        this.name = name;
        this.engine = engine;
        this.addons = addons;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public String getAddons() {
        return addons;
    }
}
