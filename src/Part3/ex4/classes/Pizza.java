package Part3.ex4.classes;

import Part3.ex4.Customizable;

import java.util.ArrayList;

public class Pizza extends Foodstuff implements Customizable {
    private String size;
    ArrayList<String> ingredients;

    public Pizza(String id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
        ingredients = new ArrayList<>();
    }

    @Override
    public void addIngredients(String ingredient) {
        ingredients.add(ingredient);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
