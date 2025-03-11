package Part2.ex1.classes;

public abstract class Transport {
    protected int id;
    protected final double velocitatActual;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVelocitatActual() {
        return velocitatActual;
    }

    public double tempsDistancia(double distancia){
        return distancia/velocitatActual;
    };

    public abstract double preuAPagar(double distancia);

    @Override
    public String toString() {
        return "Transport{" +
                "id=" + id +
                ", velocitatActual=" + velocitatActual +
                '}';
    }

    public Transport(int id, double velocitatActual){
        this.id = id;
        this.velocitatActual = velocitatActual;
    }
}
