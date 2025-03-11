package Part3.ex4;

import java.util.ArrayList;

public class Milkshake extends Drink{
    private String milkTupe;
    ArrayList<String> ingredients;

    public Milkshake(int id, String name, double price, String size, String milkTupe) {
        super(id, name, price, size);
        this.milkTupe = milkTupe;
        ingredients = new ArrayList<>();
    }

    public String getMilkTupe() {
        return milkTupe;
    }

    public void setMilkTupe(String milkTupe) {
        this.milkTupe = milkTupe;
    }

    @Override
    public String toString() {
        return "Milkshake{" +
                "milkTupe='" + milkTupe + '\'' +
                ", size='" + size + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
