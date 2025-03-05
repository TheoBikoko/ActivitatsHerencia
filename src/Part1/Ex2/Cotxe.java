package Part1.Ex2;

public final class Cotxe extends Vehicle{
    private int plaça;

    public Cotxe(String matricula, int plaça) {
        super(matricula);
        this.plaça = plaça;
    }

    @Override
    public Double preuLloguer(int dies) {
        return super.preuLloguer(dies)+ (1.5*dies*plaça);
    }
}
