package Part2.Ex3.classes;

public abstract class Espai {
    protected int id;
    protected double superficie;
    protected boolean teLlumNatural;
    protected double consumElectric;

    public Espai(int id, double superficie, boolean teLlumNatural, double consumElectric) {
        this.id = id;
        this.superficie = superficie;
        this.teLlumNatural = teLlumNatural;
        this.consumElectric = consumElectric;
    }

    protected double ConsumPerMetreQuadrat(){
        return consumElectric*superficie;
    };

    protected abstract double espaiUtil();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isTeLlumNatural() {
        return teLlumNatural;
    }

    public void setTeLlumNatural(boolean teLlumNatural) {
        this.teLlumNatural = teLlumNatural;
    }

    public double getConsumElectric() {
        return consumElectric;
    }

    public void setConsumElectric(double consumElectric) {
        this.consumElectric = consumElectric;
    }

    @Override
    public String toString() {
        return "Espai{" +
                "id=" + id +
                ", superficie=" + superficie +
                ", teLlumNatural=" + teLlumNatural +
                ", consumElectric=" + consumElectric +
                '}';
    }
}
