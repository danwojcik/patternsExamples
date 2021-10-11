package patterns.structural.adapter;

public abstract class AmericanCar implements AmericanMovable {

    protected double speed;

    public double getSpeedKMH() {
        return speed * SpeedConventer.MILES_TO_KILOMETERS.getConventer();
    }
}
