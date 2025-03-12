package Part3.ex5.classes;

public sealed class Figura3D extends FiguraGeometrica permits Cilindre, Piramide{
    public Figura3D(int idFigura) {
        super(idFigura);
    }
}
