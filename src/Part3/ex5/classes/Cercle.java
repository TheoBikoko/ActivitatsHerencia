package Part3.ex5.classes;

import Part3.ex5.interficies.Constants;

public final class Cercle extends Figura2D implements Constants {
    private double radi;

    public Cercle(int idFigura, double radi) {
        super(idFigura);
        this.radi = radi;
    }

    @Override
    public double perimetre(){
        return 2*Pi*radi;
    }

    @Override
    public double area(){
        return Pi*radi*radi;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "idFigura=" + idFigura +
                ", radi=" + radi +
                '}';
    }
}
