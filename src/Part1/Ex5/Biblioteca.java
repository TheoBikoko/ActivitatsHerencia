package Part1.Ex5;

import Part1.Ex4.Biblioteca.Fitxa;

import java.util.ArrayList;

public class Biblioteca {
    private int dimensio;
    private ArrayList<Fitxa> fitxes;

    public Biblioteca(int dimensio) {
        this.dimensio = dimensio;
        fitxes = new ArrayList<>(100);
    }

    public Biblioteca() {
        fitxes = new ArrayList<>(100);
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
        return fitxes.size() - contadorFitxes;
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
                System.out.println("Ja existeix una fitxa amb la mateixa referencia.");
                return;
            }
        }
        fitxes.add(novaFitxa);
        System.out.println("Fitxa afegida.");
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
            throw new ArrayIndexOutOfBoundsException("La posicio indicada no es troba dins la biblioteca");
        }
        return fitxes.get(posicio);
    }

    public void visualitzarContingut(){
        for (Fitxa fitxa: fitxes){
            System.out.println(fitxa);
            }
    }
}
