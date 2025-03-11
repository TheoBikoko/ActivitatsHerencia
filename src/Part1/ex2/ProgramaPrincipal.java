package Part1.ex2;

import Part1.ex2.classes.*;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean execucio = true;
        Empleat empleat = new Empleat();

        while(execucio){
            System.out.println("Escull una opció: \n" +
                    "1. Afegir un vehicle \n" +
                    "2. Obtenir preu del lloguer d'un vehicle \n" +
                    "3. Obtenir preu del lloguer de tots els vehicles \n" +
                    "4. Sortir");

            int opció = input.nextInt();
            input.nextLine();
            switch (opció){
                case 1:
                    System.out.println("Indiqui quin tipus de vehicle desitja afegir:\n" +
                            "1. Cotxe \n" +
                            "2. Microbus \n" +
                            "3. Furgoneta de carrega \n" +
                            "4. Camio");
                    int tipus = input.nextInt();
                    input.nextLine();
                    System.out.println("Indiqui la matricula del vehicle: ");
                    String matricula = input.nextLine();

                    switch (tipus){
                        case 1:
                            System.out.println("Indiqui la quantitat de places del cotxe: ");
                            int placesCotxe = input.nextInt();
                            input.nextLine();
                            Vehicle cotxe = new Cotxe(matricula, placesCotxe);
                           empleat.afegirVehicle(cotxe);
                            System.out.println("Cotxe afegit correctament. \n");
                            break;

                        case 2:
                            System.out.println("Indiqui la quantitat de places del microbus: ");
                            int placesMicrobus = input.nextInt();
                            input.nextLine();
                            Vehicle microbus = new Microbus(matricula,placesMicrobus);
                            empleat.afegirVehicle(microbus);
                            System.out.println("Microbus afegit correctament. \n");
                            break;

                        case 3:
                            System.out.println("Indiqui el pes maxim autoritzat de la furgoneta: ");
                            double pma = input.nextDouble();
                            input.nextLine();
                            Vehicle furgoneta = new FurgonetaDeCarrega(matricula,pma);
                            empleat.afegirVehicle(furgoneta);
                            System.out.println("Furgoneta de carrega afegida correctament. \n");
                            break;

                        case 4:
                            Vehicle camio = new Camio(matricula);
                            empleat.afegirVehicle(camio);
                            System.out.println("Camio afegit correctament. \n");
                            break;

                    }
                    break;

                case 2:
                    System.out.println("Indiqui la matricula del vehicle: ");
                    matricula = input.nextLine();
                    System.out.println("Indiqui la quantitat de dies que desitjaria llogar un vehicle: ");
                    int dies = input.nextInt();
                    input.nextLine();
                    empleat.obtenirPreuVehicle(matricula, dies);
                    break;

                case 3:
                    System.out.println("Indiqui la quantitat de dies que desitja llogar el vehicle: ");
                    dies = input.nextInt();
                    empleat.obtenirPreuDeTotsElsVehicles(dies);
                    break;

                case 4:
                    System.out.println("Gràcies per utilitzar el nostre programa.");
                    execucio = false;
                    break;
            }
        }
    }
}

