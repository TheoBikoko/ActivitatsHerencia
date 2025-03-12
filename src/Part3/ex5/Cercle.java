package Part3.ex5;

public final class Cercle extends FiguraGeometrica {
private final Double radi;

    public Cercle (Double coord_x, Double coord_y, String color, Double radi) {
        super(coord_x, coord_y, color);
        this.radi = radi;
        }

    public double perimetre(){
        return 2*Math.PI*radi;
    }

    public double area(){
        return Math.PI*radi*radi;
    }
}
