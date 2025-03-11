package Part3.ex3.classes;

public class Revista extends Publicacio{
    private int nombre;

    public Revista(int codi, String titol, String any, int nombre) {
        super(codi, titol, any);
        this.nombre = nombre;
    }

    public int getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nombre='" + nombre + '\'' +
                ", codi=" + codi +
                ", titol='" + titol + '\'' +
                ", any='" + any + '\'' +
                '}';
    }
}
