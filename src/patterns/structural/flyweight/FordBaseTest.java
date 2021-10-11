package patterns.structural.flyweight;

import java.util.Arrays;
import java.util.List;

public class FordBaseTest {

    public static void main(String[] args) {

        FordMustang mustang1 = new FordMustang("midnigt sky", "4.0", "sony");
        FordMustang mustang2 = new FordMustang("ruby red", "4.5", "denon");
        FordMustang mustang3 = new FordMustang("midnigt sky", "3.5", "denon");
        FordMustang mustang4 = new FordMustang("black panther", "3.2", "sony");
        FordMustang mustang5 = new FordMustang("midnigt sky", "4.0", "denon");

        System.out.println("-----------------");
        FordMustangBaseFactory.getFordMustangBaseSet()
                .stream()
                .forEach(x -> System.out.println(x.getEngine() + " " + x.getColor()));

        System.out.println(mustang1);

        System.out.println("----------");

        List<FordMustang> mustangs = Arrays.asList(mustang1, mustang2, mustang3, mustang4, mustang5);

        mustangs.forEach(x -> System.out.println(x.printMustangData()));
    }
}
