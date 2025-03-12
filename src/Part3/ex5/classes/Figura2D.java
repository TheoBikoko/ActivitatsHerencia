package Part3.ex5.classes;

public abstract sealed class Figura2D extends FiguraGeometrica permits Cercle, Rectangle{
    public Figura2D(int idFigura) {
        super(idFigura);
    }
}
