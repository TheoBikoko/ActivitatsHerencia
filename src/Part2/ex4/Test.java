package Part2.ex4;

import Part2.ex4.classes.Factura;
import Part2.ex4.classes.FacturaClientFNTipus1;
import Part2.ex4.classes.FacturaClientFNTipus2;
import Part2.ex4.classes.FacturaClientNormal;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Factura> factures = new ArrayList<>();

        FacturaClientFNTipus1 factura1 = new FacturaClientFNTipus1(30,30,30);
        FacturaClientFNTipus2 factura2 = new FacturaClientFNTipus2(30,30,30);
        FacturaClientNormal factura3 = new FacturaClientNormal(30,30,30);
        FacturaClientFNTipus2 factura4 = new FacturaClientFNTipus2(80,80,80);

        factures.add(factura1);
        factures.add(factura2);
        factures.add(factura3);
        factures.add(factura4);

        System.out.println(factura1.importTotal());
        System.out.println(factura2.importTotal());
        System.out.println(factura3.importTotal());
        System.out.println(factura4.importTotal());


        for (Factura factura: factures){
            if (factura instanceof FacturaClientFNTipus2){
            System.out.println("\nDETALL FACTURA\n" + "==============");
            System.out.println("Consum: " + factura.getImportConsum());
            System.out.println("Sanejament: " + factura.getImportSanejament());
            System.out.println("Residuals: " + factura.getImportResiduals());
            System.out.println("Descompte Aplicat a Sanejament: " + factura.getImportSanejament());
            System.out.println("Descompte Aplicat a Residuals: " + factura.getDescompteResiduals());
            System.out.println("TOTAL : " + factura.importTotal());
            System.out.println("NOTA: si l'import màxim de sanejament i residuals és superior a 16, s'ha comptabilitzat 16.");
            }
            else {
                System.out.println("\nDETALL FACTURA\n" + "==============");
                System.out.println("Consum: " + factura.getImportConsum());
                System.out.println("Sanejament: " + factura.getImportSanejament());
                System.out.println("Residuals: " + factura.getImportResiduals());
                System.out.println("Descompte Aplicat a Sanejament: " + factura.getImportSanejament());
                System.out.println("Descompte Aplicat a Residuals: " + factura.getDescompteResiduals());
                System.out.println("TOTAL : " + factura.importTotal());
            }
        }
    }
}

