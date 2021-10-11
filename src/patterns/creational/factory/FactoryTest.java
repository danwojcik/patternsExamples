package patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class FactoryTest {

    public static void main(String[] args) {

        MacBook macBook = MacBookFactory.getMacBook("Air", "Mac Air 2015", "256", 2);
        MacBook macBook2 = MacBookFactory.getMacBook("Pro", "Mac Pro 2016", "512", 16);
        MacBook macBook3 = MacBookFactory.getMacBook("air", "Mac Air 2013", "256", 8);

        List<MacBook> macBookList = new ArrayList<>();
        macBookList.add(macBook);
        macBookList.add(macBook2);
        macBookList.add(macBook3);
        macBookList.stream()
                .forEach(x -> System.out.println(x.getName() + " " + x.getDisc()));
    }
}
