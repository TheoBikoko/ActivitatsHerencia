package Part1.ex6;

import Part1.ex6.classes.Comercial;
import Part1.ex6.classes.Empleat;
import Part1.ex6.classes.Repartidor;

public class TestEmpleats {
    public static void main(String[] args) {
        Empleat empleat = new Empleat("Theo", "Bikoko Pineda", 27, 1200);
        Repartidor repartidor = new Repartidor("","", 77, 1320.56, "Gracia");
        Repartidor repartidor2 = new Repartidor("Joan","Escobar", 15, 890, "Ciutat Vella");
        Comercial comercial = new Comercial("Hector", "Soria", 41, 1546.78, 10f);
        Comercial comercial2 = new Comercial("Hector", "Soria", 20, 452.36, 30f);

        System.out.println(empleat.equals(repartidor));
        System.out.println(repartidor2.equals(comercial2) + "\n");
        System.out.println(repartidor.comprovaNom());
        System.out.println(comercial2.comprovaNom() + "\n");
        System.out.println(comercial.comissioVenta(13000f));
        System.out.println(comercial2.comissioVenta(13000f));
        System.out.println(empleat.getClass());
        System.out.println(repartidor.getClass());
        System.out.println(comercial.getClass() + "\n");
        System.out.println(repartidor2.plus(1200));
        System.out.println(repartidor.plus(1200) + "\n");
        System.out.println(repartidor instanceof Empleat);
        System.out.println(empleat instanceof Repartidor);
        System.out.println(empleat instanceof Comercial);
        System.out.println(comercial2 instanceof Empleat + "\n");
    }
}
