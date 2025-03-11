package Part3.ex3.classes;

import Part3.ex3.Prestable;

public class Llibre extends Publicacio implements Prestable {
    private boolean prestat;

    public Llibre(int codi, String titol, String any) {
        super(codi, titol, any);
        this.prestat = false;
    }

    @Override
    public boolean prestar() {
        return prestat = true;
    }

    @Override
    public boolean tornar() {
        return prestat = false;
    }

    @Override
    public boolean prestat() {
        return prestat;
    }

    @Override
    public String toString() {
        return "Llibre{" +
                "prestat=" + prestat +
                ", codi=" + codi +
                ", titol='" + titol + '\'' +
                ", any='" + any + '\'' +
                '}';
    }
}
