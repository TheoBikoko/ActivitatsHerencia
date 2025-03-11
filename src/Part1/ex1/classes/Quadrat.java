package Part1.ex1.classes;

public final class Quadrat extends  ObjecteGeometric {
    private final Double costat;

    public Quadrat(Double coord_x, Double coord_y, String color, Double costat){
        super(coord_x, coord_y, color);
        this.costat = costat;
    }

    public Double perimetre(){
        return 4*costat;
    }

    public Double area(){
        return costat*costat;
    }
}
