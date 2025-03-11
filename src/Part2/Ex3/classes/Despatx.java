package Part2.Ex3.classes;

public class Despatx extends Espai{
    private int nombreDeTaules;
    private boolean disposaDeMaquinaDeCafe;

    public Despatx(int id, double superficie, boolean teLlumNatural, double consumElectric, int nombreDeTaules, boolean disposaDeMaquinaDeCafe) {
        super(id, superficie, teLlumNatural, consumElectric);
        this.nombreDeTaules = nombreDeTaules;
        this.disposaDeMaquinaDeCafe = disposaDeMaquinaDeCafe;
    }

    @Override
    public double ConsumPerMetreQuadrat(){
        return consumElectric/superficie;
    }

    @Override
    public double espaiPerEstudiant(int nombreAlumnes) {
        return superficie/nombreAlumnes;
    }

    public int getNombreDeTaules() {
        return nombreDeTaules;
    }

    public void setNombreDeTaules(int nombreDeTaules) {
        this.nombreDeTaules = nombreDeTaules;
    }

    public boolean isDisposaDeMaquinaDeCafe() {
        return disposaDeMaquinaDeCafe;
    }

    public void setDisposaDeMaquinaDeCafe(boolean disposaDeMaquinaDeCafe) {
        this.disposaDeMaquinaDeCafe = disposaDeMaquinaDeCafe;
    }

    @Override
    public String toString() {
        return "Despatx{" +
                "nombreDeTaules=" + nombreDeTaules +
                ", disposaDeMaquinaDeCafe=" + disposaDeMaquinaDeCafe +
                ", id=" + id +
                ", superficie=" + superficie +
                ", teLlumNatural=" + teLlumNatural +
                ", consumElectric=" + consumElectric +
                '}';
    }
}
