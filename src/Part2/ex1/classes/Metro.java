package Part2.ex1.classes;

public class Metro extends Transport{
    float preuBillet;

    public Metro(int id, double velocitatActual, float preuBillet) {
        super(id, velocitatActual);
        this.preuBillet = preuBillet;
    }

    public double tempsDistancia(double distancia) {
        return super.tempsDistancia(distancia);
    }

    @Override
    public double preuAPagar(double distancia) {
        return preuBillet + (distancia/5);
    }

    public float getPreuBillet() {
        return preuBillet;
    }

    public void setPreuBillet(float preuBillet) {
        this.preuBillet = preuBillet;
    }
}
