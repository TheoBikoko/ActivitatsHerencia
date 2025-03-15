package Part3.ex5.classes;

import Part3.ex5.interficies.Calculs3D;

public abstract sealed class Figura3D extends FiguraGeometrica implements Calculs3D permits Cilindre, Piramide{
    public Figura3D(int idFigura) {
        super(idFigura);
    }
}
