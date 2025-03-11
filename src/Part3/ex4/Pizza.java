package Part3.ex4;

import java.util.ArrayList;

public class Pizza extends Foodstuff{
    private double size;
    ArrayList<String> ingredients;

    public Pizza(int id, String name, double price, double size) {
        super(id, name, price);
        this.size = size;
        ingredients = new ArrayList<>();
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
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
