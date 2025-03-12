package Part3.ex4.classes;

import Part3.ex4.Customizable;

import java.util.ArrayList;

public class Milkshake extends Drink implements Customizable {
    private String milkType;
    ArrayList<String> ingredients;

    public Milkshake(String id, String name, double price, String milkType) {
        super(id, name, price);
        this.milkType = milkType;
        ingredients = new ArrayList<>();
    }

    @Override
    public void addIngredients(String ingredient) {
        ingredients.add(ingredient);
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Milkshake{" +
                "milkTupe='" + milkType + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
