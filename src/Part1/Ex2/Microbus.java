package Part1.Ex2;

public final class Microbus extends Vehicle{
    private int plaça;

    public Microbus(String matricula, int plaça) {
        super(matricula);
        this.plaça = plaça;
    }

    @Override
    public Double preuLloguer(int dies) {
        return super.preuLloguer(dies) + (2*plaça);
    }
}
