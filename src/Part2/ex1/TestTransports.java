package Part2.ex1;

import Part2.ex1.classes.Bicicleta;
import Part2.ex1.classes.Cotxe;
import Part2.ex1.classes.Metro;
import Part2.ex1.classes.Transport;

import java.util.ArrayList;

public class TestTransports {
    public static void main(String[] args) {
        ArrayList<Transport> transports = new ArrayList<>();

        Cotxe cotxe = new Cotxe(1,65.34,"Gasolina", 1.50f, 0.5f);
        Bicicleta bicicleta = new Bicicleta(2,20.43,6);
        Metro metro = new Metro(3,324.54, 5.5f);

        transports.add(cotxe);
        transports.add(bicicleta);
        transports.add(metro);

        for (Transport transport: transports){
            System.out.println("Temps (en hores) en recorrer la distancia del transport amb id " + transport.getId() + ": " + transport.tempsDistancia(60) + (" h. \n"));
            System.out.println("Preu total pel recorregut del transport amb id " + transport.getId() + ": " + transport.preuAPagar(60) + (" €. \n"));
        }

    }
}
