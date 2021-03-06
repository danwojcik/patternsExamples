package patterns.structural.decorator;

public class TestDecorator {

    public static void main(String[] args) {

        Car basicCar = new BaseCar("red");
        basicCar.assemble();

        System.out.println("----------");
        Car basicCar2 = new BaseCar("yellow");
        Car sportCar = new SportPack(basicCar2, true, false);
        sportCar.assemble();

        System.out.println("----------");
        Car basicCar3 = new BaseCar("blue");
        WinterPack winterCar = new WinterPack(basicCar3, true, true);
        winterCar.assemble();

        System.out.println("----------");
        Car basicCar4 = new BaseCar("black");
        WinterPack winterCar2 = new WinterPack(basicCar4, true, false);

        SportPack sportCar2 = new SportPack(winterCar2, true, true);
        sportCar2.assemble();
    }
}
