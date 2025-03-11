package Part1.ex5;

import Part1.ex4.biblioteca.Fitxa;
import Part1.ex4.biblioteca.Obra;
import Part1.ex4.biblioteca.Revista;
import Part1.ex4.biblioteca.Volum;

public class NovaBiblioteca {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        System.out.println(biblioteca.getFitxes().size());

        Fitxa fitxa = new Fitxa("879725","La Biblia de Poblenou");
        Fitxa fitxa2 = new Fitxa("879725","Michael Jordan or LeBron James: GOAT Debate");
        Obra obra = new Obra("ASDASD", fitxa.getTitol(), "Jordan Peterson", (short) 234);
        Volum volum = new Volum("ASDASD1", fitxa.getTitol(), obra.getAutor(), obra.getNrePags(), (short) 125);
        Revista revista = new Revista("ASDASD2", fitxa.getTitol(), (short) 1997, (short) 213);

        biblioteca.afegirFitxa(fitxa);
        biblioteca.afegirFitxa(fitxa2);
        biblioteca.afegirFitxa(obra);
        biblioteca.afegirFitxa(volum);
        biblioteca.afegirFitxa(revista);

        System.out.println("Actualment, la biblioteca disposa de " + biblioteca.nombreElements() + (" elements."));

        System.out.println("Actualment, la biblioteca te una capacitat de " + biblioteca.capacitatBiblioteca() + (" elements per a afegir"));

        biblioteca.visualitzarContingut();

        System.out.println(biblioteca.extreureFitxaAmbReferencia("ASDASD"));
        System.out.println(biblioteca.extreureFitxaAmbReferencia("ASDASD1"));
        System.out.println(biblioteca.extreureFitxaAmbReferencia("ASDASD2"));

        System.out.println(biblioteca.extreureFitxaAmbPosicio(0));
        System.out.println(biblioteca.extreureFitxaAmbPosicio(1));
        System.out.println(biblioteca.extreureFitxaAmbPosicio(3));
        System.out.println(biblioteca.extreureFitxaAmbPosicio(8));
        System.out.println(biblioteca.extreureFitxaAmbPosicio(-7));

    }
}
