package Part1.ex2.classes;

public final class Camio extends Vehicle {

    public Camio(String matricula) {
        super(matricula);
    }

    @Override
    public Double preuLloguer(int dies) {
        return super.preuLloguer(dies) + 40;
    }
}
