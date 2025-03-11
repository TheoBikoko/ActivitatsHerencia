package Part2.ex2.classes;

public class Peix extends Organisme{
    private String procedencia;
    private String dieta;
    private double longitud;

    public Peix(String nom, String familia, String tipusLlum, double temperaturaMaxima, double temperaturaMinima, double phMaxim, double phMinim, String procedencia, String dieta, double longitud) {
        super(nom, familia, tipusLlum, temperaturaMaxima, temperaturaMinima, phMaxim, phMinim);
        this.procedencia = procedencia;
        this.dieta = dieta;
        this.longitud = longitud;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Peix{" +
                "procedencia='" + procedencia + '\'' +
                ", dieta='" + dieta + '\'' +
                ", longitud=" + longitud +
                ", nom='" + nom + '\'' +
                ", familia='" + familia + '\'' +
                ", tipusLlum='" + tipusLlum + '\'' +
                ", temperaturaMaxima=" + temperaturaMaxima +
                ", temperaturaMinima=" + temperaturaMinima +
                ", phMaxim=" + phMaxim +
                ", phMinim=" + phMinim +
                '}';
    }
}
