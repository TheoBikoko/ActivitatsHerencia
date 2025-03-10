package Part2.Ex2.classes;

public class Planta extends Organisme{
    private String tipus;

    public Planta(String nom, String familia, String tipusLlum, double temperaturaMaxima, double temperaturaMinima, double phMaxim, double phMinim, String tipus) {
        super(nom, familia, tipusLlum, temperaturaMaxima, temperaturaMinima, phMaxim, phMinim);
        this.tipus = tipus;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
}
