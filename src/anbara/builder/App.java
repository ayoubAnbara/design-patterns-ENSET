package anbara.builder;

public class App {
    public static void main(String[] args) {
        Pizza pizza =  new Pizza.PizzaBuilder()
                .setSauce("Sauce")
                .setTopping("Topping")
                .setDough("Dough")
                .build();

        System.out.println("Pizza = " + pizza);
    }
}
