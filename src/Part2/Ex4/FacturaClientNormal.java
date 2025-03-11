package Part2.Ex4;

public class FacturaClientNormal extends Factura{
    public FacturaClientNormal(double importConsum, double importSanejament, double importResiduals) {
        super(importConsum, importSanejament, importResiduals);
    }

    @Override
    public double importTotal(){
        return importConsum + importSanejament + importResiduals;
    }
}
