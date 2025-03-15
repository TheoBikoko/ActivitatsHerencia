package Part3.ex5.classes;

import Part3.ex5.interficies.Calculs2D;

public abstract sealed class Figura2D extends FiguraGeometrica implements Calculs2D permits Cercle, Rectangle{
    public Figura2D(int idFigura) {
        super(idFigura);
    }
}
