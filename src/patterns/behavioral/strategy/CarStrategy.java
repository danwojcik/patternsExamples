package patterns.behavioral.strategy;

public class CarStrategy implements TravelStrategy {

    private boolean includeMotorsways;
    private boolean includeFieldRoad;

    public CarStrategy(boolean includeMotorsways, boolean includeFieldRoad) {

        this.includeMotorsways = includeMotorsways;
        this.includeFieldRoad = includeFieldRoad;
    }

    @Override
    public void setTravelPlan(String from, String to) {

        StringBuilder plan = new StringBuilder("Travel by car")
                .append(includeMotorsways ? " including paid roads" : "")
                .append(includeFieldRoad ? " including field roads" : "")
                .append(".");
        System.out.println(plan);
    }
}
