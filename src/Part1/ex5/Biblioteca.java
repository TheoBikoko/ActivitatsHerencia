package Part1.ex5;

import Part1.ex4.biblioteca.Fitxa;

import java.util.ArrayList;

public class Biblioteca {
    private int dimensio;
    private ArrayList<Fitxa> fitxes;

    public Biblioteca(int dimensio) {
        this.dimensio = dimensio;
        fitxes = new ArrayList<>(dimensio);
    }

    public int getDimensio() {
        return dimensio;
    }

    public void setDimensio(int dimensio) {
        this.dimensio = dimensio;
    }

    public ArrayList<Fitxa> getFitxes() {
        return fitxes;
    }

    public void setFitxes(ArrayList<Fitxa> fitxes) {
        this.fitxes = fitxes;
    }

    public int capacitatBiblioteca(){
        int contadorFitxes = 0;
        for (Fitxa fitxa : fitxes) {
            contadorFitxes++;
        }
        return dimensio - fitxes.size();
    }

    public int nombreElements(){
        int contador = 0;
        for (Fitxa fitxa : fitxes) {
            contador++;
        }
        return contador;
    }

    public void afegirFitxa(Fitxa novaFitxa){
        for (Fitxa fitxa : fitxes) {
            if (fitxa.getReferencia().equals(novaFitxa.getReferencia())){
                System.out.println("\nJa existeix una fitxa amb la mateixa referencia.");
                return;
            }
        }
        if (capacitatBiblioteca() == 0){
            System.out.println("\nLa biblioteca esta completa, no es poden afegir mes fitxes.");
        }
        else {
            fitxes.add(novaFitxa);
            System.out.println("\nFitxa afegida.");
        }
    }

    public Fitxa extreureFitxaAmbReferencia(String referencia){
        for (Fitxa fitxa: fitxes){
            if (fitxa.getReferencia().equals(referencia)){
                return fitxa;
            }
        }
        return null;
    }

    public Fitxa extreureFitxaAmbPosicio(int posicio){

        if (posicio >= fitxes.size() || posicio < 0){
            throw new ArrayIndexOutOfBoundsException("\nLa posicio indicada no es troba dins la biblioteca, actualment pot escollir des de la posicio 0 fins la " + (fitxes.size() - 1) + ".");
        }
        return fitxes.get(posicio);
    }

    public void visualitzarContingut(){
        for (Fitxa fitxa: fitxes){
            System.out.println("\n" + fitxa);
            }
    }
}
