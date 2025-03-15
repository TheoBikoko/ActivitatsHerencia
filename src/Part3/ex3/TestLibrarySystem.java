package Part3.ex3;

import Part3.ex3.classes.Llibre;
import Part3.ex3.classes.Revista;

public class TestLibrarySystem {
    public static void main(String[] args) {
        Llibre llibre = new Llibre(1, "Harry Potter", "1997");
        Revista revista = new Revista(2, "Poblenou Magazine", "2024", 1);

        System.out.println("Codi del llibre: " + llibre.getCodi() + ", any de publicacio: " + llibre.getAny());
        System.out.println("Codi de la revista: " + revista.getCodi() + ", any de publicacio: " + revista.getAny());

        System.out.println("Llibre acaba d'arribar a la biblioteca, estat: " + llibre.prestat());
        llibre.prestar();
        System.out.println("S'acaba de prestar el llibre, estat: " + llibre.prestat());
        llibre.tornar();
        System.out.println("S'acaba de tornar el llibre, estat: " + llibre.prestat());

    }
}
