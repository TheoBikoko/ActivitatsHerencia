package Part3.ex5.classes;

import Part3.ex5.interficies.Calculs3D;

public final class Piramide extends Figura3D implements Calculs3D {
    private double base;
    private double altura;

    public Piramide(int idFigura, double base, double altura) {
        super(idFigura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetre() {
        return 4*base;
    }

    @Override
    public double area() {
        return base*base + 2*base*altura;
    }

    @Override
    public double volum() {
        return base*base*altura/3;
    }

    @Override
    public String toString() {
        return "Piramide{" +
                "idFigura=" + idFigura +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
