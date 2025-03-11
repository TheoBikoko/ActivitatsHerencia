package Part1.ex1.classes;

public sealed class ObjecteGeometric permits Cercle, Quadrat {
    protected Double coord_x;
    protected Double coord_y;
    protected String color;

    public ObjecteGeometric(Double coord_x, Double coord_y, String color) {
        this.coord_x = coord_x;
        this.coord_y = coord_y;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ObjecteGeometric{" +
                "coord_x=" + coord_x +
                ", coord_y=" + coord_y +
                ", color='" + color + '\'' +
                '}';
    }
}
