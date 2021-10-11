package patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilderDemo {

    public static void main(String[] args) {

        House house1 = new House.HouseBuilder("concrete", "wood", "wood")
                .build();

        House house2 = new House.HouseBuilder("pustaki", "max", "dachówka")
                .withGarage("wiata")
                .build();

        House house3 = new House.HouseBuilder("wylewka", "ytong", "papa")
                .withGarage("w bryle")
                .withGarden("oczko wodno")
                .build();

        House house4 = new House.HouseBuilder("pustaki", "max", "dachówka")
                .withGarden("plac zabaw")
                .build();

        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        houses.get(0).getGarage().equalsIgnoreCase("aaa");
    }
}
