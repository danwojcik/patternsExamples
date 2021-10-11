package patterns.behavioral.state;

public class Flying implements FlightState {

    private static Flying INSTANCE = new Flying();

    private Flying() {
    }

    public static Flying getINTANCE() {
        return INSTANCE;
    }

    @Override
    public void updateState(Flight flight) {

        System.out.println("flying. cabin crew provides drinks and meals.");

        flight.setFlightState(Landed.getINSTANCE());
    }
}

