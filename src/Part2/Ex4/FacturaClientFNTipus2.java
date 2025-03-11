package Part2.Ex4;

public class FacturaClientFNTipus2 extends Factura{

    public FacturaClientFNTipus2(double importConsum, double importSanejament, double importResiduals) {
        super(importConsum, importSanejament, importResiduals);
        this.descompteSanejament = 75;
        this.descompteResiduals =  50;
    }

    @Override
    public double importTotal(){
        if (importResiduals*descompteResiduals > 16 && importSanejament*descompteSanejament > 16){
            return importConsum + 32;
        }
        return importConsum + importSanejament*(descompteSanejament /100.0) + importResiduals*(descompteResiduals/100.0);
    }
}
