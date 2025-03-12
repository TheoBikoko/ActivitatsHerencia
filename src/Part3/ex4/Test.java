package Part3.ex4;

import Part3.ex4.classes.Burger;
import Part3.ex4.classes.Drink;
import Part3.ex4.classes.Milkshake;
import Part3.ex4.classes.Pizza;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();

        Burger burger = new Burger("1", "Poblenou Double Bacon Cheeseburger", 12.99, "Beef meat");
        Drink drink = new Drink("2", "Poblerade", 5.15);
        Milkshake milkshake = new Milkshake("3", "Pobleshake", 9.57, "Almond milk");
        Pizza pizza = new Pizza("4", "Pobleninni Diavola", 14.69, "Large");

        manager.addOrder(burger);
        manager.addOrder(drink);
        manager.addOrder(milkshake);
        manager.addOrder(pizza);

        System.out.println("List of orders: ");
        manager.showOrders();
        System.out.println("\nOrders that can be customized: " + manager.showCustomizableOrders());

        ArrayList<String> pobleninniIngredients = new ArrayList<>();
        pobleninniIngredients.add("Tomato Sauce");
        pobleninniIngredients.add("Emmental Cheese");
        pobleninniIngredients.add("Mozzarella Cheese");
        pobleninniIngredients.add("Pepperoni");

        pizza.setIngredients(pobleninniIngredients);
        pizza.addIngredients("Pineapple");
        pizza.addIngredients("Olives");

        ArrayList<String> pobleshakeIngredients = new ArrayList<>();
        pobleshakeIngredients.add("Whipped Cream");
        pobleshakeIngredients.add("Caramel");
        pobleshakeIngredients.add("Oreo");

        milkshake.setIngredients(pobleshakeIngredients);
        milkshake.addIngredients("Strawberry");
        milkshake.addIngredients("Olives");

        System.out.println("Poblenini ingredients: " + pizza.getIngredients());
        System.out.println("Pobleshake ingredients: " + milkshake.getIngredients());


    }
}
