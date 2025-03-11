package Part2.ex2.classes;

public abstract class Organisme {
    protected String nom;
    protected String familia;
    protected String tipusLlum;
    protected double temperaturaMaxima;
    protected double temperaturaMinima;
    protected double phMaxim;
    protected double phMinim;

    public Organisme(String nom, String familia, String tipusLlum, double temperaturaMaxima, double temperaturaMinima, double phMaxim, double phMinim) {
        this.nom = nom;
        this.familia = familia;
        this.tipusLlum = tipusLlum;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.phMaxim = phMaxim;
        this.phMinim = phMinim;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getTipusLlum() {
        return tipusLlum;
    }

    public void setTipusLlum(String tipusLlum) {
        this.tipusLlum = tipusLlum;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public double getPhMaxim() {
        return phMaxim;
    }

    public void setPhMaxim(double phMaxim) {
        this.phMaxim = phMaxim;
    }

    public double getPhMinim() {
        return phMinim;
    }

    public void setPhMinim(double phMinim) {
        this.phMinim = phMinim;
    }

    @Override
    public String toString() {
        return "Organisme{" +
                "nom='" + nom + '\'' +
                ", familia='" + familia + '\'' +
                ", tipusLlum='" + tipusLlum + '\'' +
                ", temperaturaMaxima=" + temperaturaMaxima +
                ", temperaturaMinima=" + temperaturaMinima +
                ", phMaxim=" + phMaxim +
                ", phMinim=" + phMinim +
                '}';
    }
}
