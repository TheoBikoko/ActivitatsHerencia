package Part1.Ex6.classes;

public class Repartidor extends Empleat {
    private String zona;

    public Repartidor(String nom, String cognom, int edat, double salari, String zona) {
        super(nom, cognom, edat, salari);
        this.zona = zona;
    }

    public Repartidor() {
        zona = "desconeguda";
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean plus(int plusSalarial){
        return super.plus(plusSalarial);
    }

    public boolean comprovaNom(){
        return super.comprovaNom();
    }

    public String toString() {
        return "Repartidor{" +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", edat=" + edat +
                ", salari=" + salari +
                ", zona='" + zona + '\'' +
                '}';
    }
}
