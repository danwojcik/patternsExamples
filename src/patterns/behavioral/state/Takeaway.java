package patterns.behavioral.state;

public class Takeaway implements FlightState {

    private static Takeaway INSTANCE = new Takeaway();

    private Takeaway() {
    }

    public static Takeaway getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void updateState(Flight flight) {

        System.out.println("takeaway. please fasten your seatbelts and ramain seated");
        flight.setFlightState(Flying.getINTANCE());
    }
}
