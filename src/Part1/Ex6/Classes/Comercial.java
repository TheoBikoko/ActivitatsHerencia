package Part1.Ex6.Classes;

public class Comercial extends Empleat {
    private float comissio;

    public Comercial(String nom, String cognom, int edat, double salari, float comissio) {
        super(nom, cognom, edat, salari);
        this.comissio = comissio;
    }

    public Comercial() {
       comissio = 0;
    }

    public float getComissio() {
        return comissio;
    }

    public void setComissio(float comissio) {
        this.comissio = comissio;
    }

    public float comissioVenta(float preuVenta){
        return preuVenta * (comissio/100);
    }

    public boolean plus(int plusSalarial){
       return super.plus(plusSalarial);
    }

    public boolean comprovaNom(){
       return super.comprovaNom();
    }

    public String toString() {
        return "Comercial{" +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", edat=" + edat +
                ", salari=" + salari +
                ", comissio=" + comissio +
                '}';
    }
}
