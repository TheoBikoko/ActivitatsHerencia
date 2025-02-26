package Part1.Ex1;

public final class Cercle extends ObjecteGeometric{
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
