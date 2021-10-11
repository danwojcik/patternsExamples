package patterns.creational.prototype;

import java.util.List;

public class PrototypeDemo {

    public static void main(String[] args) {

        //template
        ShoppingList shoppingList = new ShoppingList();

        //shoppings today
        try {
            ShoppingList shoppingListToday = (ShoppingList) shoppingList.clone();

            List<String> todayShoppings = shoppingListToday.getShoppings();

            todayShoppings.add("piwo");
            todayShoppings.add("kiełbasa");

            shoppingListToday = new ShoppingList(todayShoppings);

            System.out.println("zakupy na dzis: ");

            shoppingListToday.getShoppings()
                    .stream()
                    .forEach(System.out::println);

            System.out.println("zakupy szablon: ");

            shoppingList.getShoppings()
                    .stream()
                    .forEach(System.out::println);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
