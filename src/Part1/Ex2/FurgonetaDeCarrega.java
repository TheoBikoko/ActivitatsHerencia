package Part1.Ex2;

public final class FurgonetaDeCarrega extends Vehicle{
    private double pma;

    public FurgonetaDeCarrega(String matricula, double pma) {
        super(matricula);
        this.pma = pma;
    }

    @Override
    public Double preuLloguer(int dies) {
        return super.preuLloguer(dies) + 20*pma;
    }
}
