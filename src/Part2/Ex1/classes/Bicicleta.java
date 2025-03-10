package Part2.Ex1.classes;

public class Bicicleta extends Transport{
private int nombreMarxes;

    public Bicicleta(int id, double velocitatActual, int nombreMarxes) {
        super(id, velocitatActual);
        this.nombreMarxes = nombreMarxes;
    }

    public double tempsDistancia(double distancia) {
        return super.tempsDistancia(distancia);
    }

    @Override
    public double preuAPagar(double distancia) {
        return 0;
    }

}
