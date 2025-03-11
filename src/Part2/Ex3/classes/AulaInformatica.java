package Part2.Ex3.classes;

public class AulaInformatica extends Espai{
    private int nombreImpressores;

    public AulaInformatica(int id, double superficie, boolean teLlumNatural, double consumElectric, int nombreImpressores) {
        super(id, superficie, teLlumNatural, consumElectric);
        this.nombreImpressores = nombreImpressores;
    }

    @Override
    public double ConsumPerMetreQuadrat(){
        return consumElectric*superficie;
    }

    @Override
    public double espaiPerEstudiant(int nombreAlumnes) {
        return superficie/nombreAlumnes - nombreImpressores;
    }

    public int getNombreImpressores() {
        return nombreImpressores;
    }

    public void setNombreImpressores(int nombreImpressores) {
        this.nombreImpressores = nombreImpressores;
    }

    @Override
    public String toString() {
        return "AulaInformatica{" +
                "nombreImpressores=" + nombreImpressores +
                ", id=" + id +
                ", superficie=" + superficie +
                ", teLlumNatural=" + teLlumNatural +
                ", consumElectric=" + consumElectric +
                '}';
    }
}
