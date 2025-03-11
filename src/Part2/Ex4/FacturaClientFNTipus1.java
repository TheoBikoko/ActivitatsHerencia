package Part2.Ex4;

public class FacturaClientFNTipus1 extends Factura{
    public FacturaClientFNTipus1(double importConsum, double importSanejament, double importResiduals) {
        super(importConsum, importSanejament, importResiduals);
        this.descompteSanejament = 25;
        this.descompteResiduals = 25;
    }

    @Override
    public double importTotal(){
        return importConsum + importSanejament*(descompteSanejament /100.0) + importResiduals*(descompteResiduals/100.0);    }


}
