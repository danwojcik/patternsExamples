package patterns.structural.adapter;

public class Test {

    public static void main(String[] args) {

        AmericanMovable jeep = new Jeep("Renegade", 145);

        Volvo volvo = new Volvo("V50", 220);

        System.out.println("jeep " + ((Jeep) jeep).getName() + " " + jeep.getSpeed());
        System.out.println("jeep " + ((Jeep) jeep).getName() + " " + ((Jeep) jeep).getSpeedKMH());

        System.out.println("volvo " + volvo.getName() + " " + volvo.getSpeed());
    }
}
