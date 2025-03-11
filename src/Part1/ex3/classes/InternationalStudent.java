package Part1.ex3.classes;

public final class InternationalStudent extends Student{
    private  String country;

    public InternationalStudent(String name, String address, String cycle, int course, String country) {
        super(name, address, cycle, course);
        this.country = country;
        System.out.println("Soc el constructor de la classe InternationalStudent");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
