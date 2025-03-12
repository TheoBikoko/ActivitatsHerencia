package Part3.ex5;

public final class Rectangle extends FiguraGeometrica {
    private final Double costat;



    public Double perimetre(){
        return 4*costat;
    }

    public Double area(){
        return costat*costat;
    }
}
