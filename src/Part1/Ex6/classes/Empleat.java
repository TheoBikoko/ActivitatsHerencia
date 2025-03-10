package Part1.Ex6.classes;

public  class Empleat{
    protected String nom;
    protected String cognom;
    protected int edat;
    protected double salari;

    public Empleat(String nom, String cognom, int edat, double salari) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.salari = salari;
    }

    public Empleat() {
        nom = "desconegut";
        cognom = "desconegut";
        edat = 0;
        salari = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }

    public boolean plus(int plusSalarial){
        if (edat > 40){
            salari += plusSalarial;
            return true;
        }
        return false;
    }

    public boolean comprovaNom(){
        if (nom.isEmpty()){return false;}
        return true;
    }

    @Override
    public String toString() {
        return "Empleat{" +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", edat=" + edat +
                ", salari=" + salari +
                '}';
    }
}

