package patterns.behavioral.state;

public class Flight {

    FlightState flightState;

    public Flight() {

        if (this.flightState == null)
        this.flightState = Onboarding.getINSTANCE();
    }

    public void setFlightState(FlightState flightState) {
        this.flightState = flightState;
    }

    public void update() {

        if (flightState instanceof Onboarding) {

            System.out.println("please find your seat");
        }
        flightState.updateState(this);
    }
}
