package Part2.Ex1.classes;

public class Cotxe extends Transport{
    private String tipusCombustible;
    private float preuPerLitreCombustible;
    private float litresGastatsPerKm;

    public Cotxe(int id, double velocitatActual, String tipusComubstible, float preuPerLitreCombustible, float litresGastatsPerKm) {
        super(id, velocitatActual);
        this.tipusCombustible = tipusComubstible;
        this.preuPerLitreCombustible = preuPerLitreCombustible;
        this.litresGastatsPerKm = litresGastatsPerKm;
    }

    public double tempsDistancia(double distancia) {
        return super.tempsDistancia(distancia);
    }

    @Override
    public double preuAPagar(double distancia) {
        return distancia*litresGastatsPerKm*preuPerLitreCombustible;
    }

    public String getTipusCombustible() {
        return tipusCombustible;
    }

    public void setTipusComubstible(String tipusComubstible) {
        this.tipusCombustible = tipusComubstible;
    }

    public float getPreuPerLitreCombustible() {
        return preuPerLitreCombustible;
    }

    public void setPreuPerLitreCombustible(float preuPerLitreCombustible) {
        this.preuPerLitreCombustible = preuPerLitreCombustible;
    }

    public float getLitresGastatsPerKm() {
        return litresGastatsPerKm;
    }

    public void setLitresGastatsPerKm(float litresGastatsPerKm) {
        this.litresGastatsPerKm = litresGastatsPerKm;
    }

    @Override
    public String toString() {
        return "Cotxe{" +
                "tipusComubstible='" + tipusCombustible + '\'' +
                ", preuPerLitreCombustible=" + preuPerLitreCombustible +
                ", litresGastatsPerKm=" + litresGastatsPerKm +
                ", id=" + id +
                ", velocitatActual=" + velocitatActual +
                '}';
    }
}
