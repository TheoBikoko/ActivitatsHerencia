package Part2.ex3.classes;

public class Laboratori extends Espai{
    private int nombreEncenedorsBunsen;

    public Laboratori(int id, double superficie, boolean teLlumNatural, double consumElectric, int nombreEncenedorsBunsen) {
        super(id, superficie, teLlumNatural, consumElectric);
        this.nombreEncenedorsBunsen = nombreEncenedorsBunsen;
    }

    public int getNombreEncenedorsBunsen() {
        return nombreEncenedorsBunsen;
    }


    public void setNombreEncenedorsBunsen(int nombreEncenedorsBunsen) {
        this.nombreEncenedorsBunsen = nombreEncenedorsBunsen;
    }

    @Override
    public double ConsumPerMetreQuadrat(){
        return consumElectric/superficie;
    }

    @Override
    public double espaiPerEstudiant(int nombreAlumnes) {
        return superficie/nombreAlumnes;
    }

    @Override
    public String toString() {
        return "Laboratori{" +
                "nombreEncenedorsBunsen=" + nombreEncenedorsBunsen +
                ", id=" + id +
                ", superficie=" + superficie +
                ", teLlumNatural=" + teLlumNatural +
                ", consumElectric=" + consumElectric +
                '}';
    }
}
