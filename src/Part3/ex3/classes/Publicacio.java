package Part3.ex3.classes;

public abstract class Publicacio {
    protected int codi;
    protected String titol;
    protected String any;

    public Publicacio(int codi, String titol, String any) {
        this.codi = codi;
        this.titol = titol;
        this.any = any;
    }

    public String getAny() {
        return any;
    }

    public int getCodi() {
        return codi;
    }

    @Override
    public String toString() {
        return "Publicacio{" +
                "codi=" + codi +
                ", titol='" + titol + '\'' +
                ", any='" + any + '\'' +
                '}';
    }
}
