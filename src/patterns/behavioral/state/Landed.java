package patterns.behavioral.state;

public class Landed implements FlightState {

    private static Landed INSTANCE = new Landed();

    private Landed() {
    }

    public static Landed getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void updateState(Flight flight) {
        System.out.println("landed. enjoy your stay");
    }
}
