package Part3.ex5.classes;

public abstract sealed class FiguraGeometrica permits Figura2D, Figura3D {
    protected int idFigura;

    public FiguraGeometrica(int idFigura) {
        this.idFigura = idFigura;

    }
}
