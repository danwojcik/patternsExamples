package patterns.structural.decorator;

public class SportPack extends CarDecorator {

    private boolean sportWheel;
    private boolean sportSeats;

    public SportPack(Car car, boolean sportWheel, boolean sportSeats) {
        super(car);
        this.sportWheel = sportWheel;
        this.sportSeats = sportSeats;
    }

    @Override
    public void assemble() {

        super.assemble();

        System.out.println("sport pack" +
                (sportWheel ? " with sport mirrors" : "") +
                (sportSeats ? " with sport seats" : "") +
                ".");
    }
}
