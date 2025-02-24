package Part1.Ex3;

public class Person {
    protected String name;
    protected String address;

    protected Person(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("Soc el constructor de la classe Person");
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
