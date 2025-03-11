package Part2.ex4.classes;

public abstract class Factura {
    protected double importConsum;
    protected double importSanejament;
    protected double importResiduals;
    protected int descompteSanejament;
    protected int descompteResiduals;

    public Factura(double importConsum, double importSanejament, double importResiduals) {
        this.importConsum = importConsum;
        this.importSanejament = importSanejament;
        this.importResiduals = importResiduals;
    }

    public abstract double importTotal();

    public double getImportConsum() {
        return importConsum;
    }

    public void setImportConsum(double importConsum) {
        this.importConsum = importConsum;
    }

    public double getImportSanejament() {
        return importSanejament;
    }

    public void setImportSanejament(double importSanejament) {
        this.importSanejament = importSanejament;
    }

    public double getImportResiduals() {
        return importResiduals;
    }

    public void setImportResiduals(double importResiduals) {
        this.importResiduals = importResiduals;
    }

    public int getDescompteSanejament() {
        return descompteSanejament;
    }

    public void setDescompteSanejament(int descompteSanejament) {
        this.descompteSanejament = descompteSanejament;
    }

    public int getDescompteResiduals() {
        return descompteResiduals;
    }

    public void setDescompteResiduals(int descompteResiduals) {
        this.descompteResiduals = descompteResiduals;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "importConsum=" + importConsum +
                ", importSanejament=" + importSanejament +
                ", importResiduals=" + importResiduals +
                ", descompteSanejament=" + descompteSanejament +
                ", descompteResiduals=" + descompteResiduals +
                '}';
    }
}
