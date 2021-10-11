package patterns.structural.adapter;

public enum  SpeedConventer {

    MILES_TO_KILOMETERS(1.609344),
    KILOMETERS_TO_MILES(0.6213712);

    private double conventer;

    SpeedConventer(double conventer) {
        this.conventer = conventer;
    }

    public double getConventer() {
        return conventer;
    }
}
