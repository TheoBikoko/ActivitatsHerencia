package Part3.ex5.classes;

import Part3.ex5.interficies.Calculs3D;
import Part3.ex5.interficies.Constants;

public final class Cilindre extends Figura3D implements Calculs3D, Constants {
    private double radi;
    private double altura;

    public Cilindre(int idFigura, double radi, double altura) {
        super(idFigura);
        this.radi = radi;
        this.altura = altura;
    }

    @Override
    public double perimetre(){
        return 2*Pi*radi;
    }

    @Override
    public double area(){
        return (2*Pi*radi*radi) + perimetre()*altura ;
    }

    @Override
    public double volum() {
        return Pi*radi*radi*altura;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilindre{" +
                "idFigura=" + idFigura +
                ", radi=" + radi +
                ", altura=" + altura +
                '}';
    }
}
