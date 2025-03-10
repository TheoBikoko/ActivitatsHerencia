package Part2.Ex3.classes;

public class Gimnas extends Espai{
    private boolean teDutxes;
    private int nombreGrades;

    public Gimnas(int id, double superficie, boolean teLlumNatural, double consumElectric, boolean teDutxes, int nombreGrades) {
        super(id, superficie, teLlumNatural, consumElectric);
        this.teDutxes = teDutxes;
        this.nombreGrades = nombreGrades;
    }

    public boolean isTeDutxes() {
        return teDutxes;
    }

    public void setTeDutxes(boolean teDutxes) {
        this.teDutxes = teDutxes;
    }

    public int getNombreGrades() {
        return nombreGrades;
    }

    public void setNombreGrades(int nombreGrades) {
        this.nombreGrades = nombreGrades;
    }

    @Override
    public String toString() {
        return "Gimnas{" +
                "teDutxes=" + teDutxes +
                ", nombreGrades=" + nombreGrades +
                '}';
    }
}
