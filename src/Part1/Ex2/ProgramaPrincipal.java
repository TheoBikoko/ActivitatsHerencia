package Part1.Ex2;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean execucio = true;

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
                    System.out.println("Indiqui quin tipus de vehicle desitja afegir: ");
                    String tipus = input.nextLine();
                    System.out.println("Indiqui la matricula del vehicle: ");
                    String matricula = input.nextLine();

                    switch (tipus){
                        case "Cotxe":
                            System.out.println("Indiqui la quantitat de places del cotxe: ");
                            int placesCotxe = input.nextInt();
                            Vehicle cotxe = new Cotxe(matricula, placesCotxe);
                            break;

                        case "Microbus":
                            System.out.println("Indiqui la quantitat de places del microbus: ");
                            int placesMicrobus = input.nextInt();
                            Vehicle microbus = new Microbus(matricula,placesMicrobus);
                            break;

                        case "Furgoneta":

                    }
                    break;

                case 2:
                    System.out.println("Indica la coordenada X del quadrat: ");
                    Double coordX2 = input.nextDouble();
                    input.nextLine();
                    System.out.println("Indica la coordenada Y del quadrat: ");
                    Double coordY2 = input.nextDouble();
                    input.nextLine();
                    System.out.println("Indica el color del quadrat: ");
                    String color2 = input.nextLine();
                    System.out.println("Indica el radi del quadrat: ");
                    Double costat = input.nextDouble();
                    input.nextLine();
                    break;

                case 3:
                    System.out.println("Gràcies per utilitzar el nostre programa.");
                    execucio = false;
                    break;

                case 4:
                    System.out.println("Gràcies per utilitzar el nostre programa.");
                    execucio = false;
                    break;
            }
        }
    }
}

