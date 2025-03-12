package Part3.ex4.classes;

public class Drink extends Foodstuff{

    public Drink(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
