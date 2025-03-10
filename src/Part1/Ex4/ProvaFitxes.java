package Part1.Ex4;

import Part1.Ex4.Biblioteca.*;

public class ProvaFitxes {
    public static void main(String[] args) {
        Fitxa fitxa = new Fitxa("879725","La Biblia de Poblenou");
        Fitxa fitxa2 = new Fitxa("879725","Michael Jordan or LeBron James: GOAT Debate");

        System.out.println("Fitxa i Fitxa2 tenen la mateixa referencia pero titols diferents. Quin es el resultat bolea? " + fitxa.equals(fitxa2));

        Obra obra = new Obra(fitxa.getReferencia(), fitxa.getTitol(), "Jordan Peterson", (short) 234);
        Volum volum = new Volum(fitxa.getReferencia(), fitxa.getTitol(), obra.getAutor(), obra.getNrePags(), (short) 125);
        Revista revista = new Revista(fitxa.getReferencia(), fitxa.getTitol(), (short) 1997, (short) 213);

        System.out.println(fitxa);
        System.out.println(obra);
        System.out.println(volum);
        System.out.println(revista);
    }
}
