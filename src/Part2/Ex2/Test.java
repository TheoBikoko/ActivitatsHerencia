package Part2.Ex2;

import Part2.Ex2.classes.Organisme;
import Part2.Ex2.classes.Peix;
import Part2.Ex2.classes.Planta;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Organisme> organismes = new ArrayList<>();

        Planta planta = new Planta("Vincent from the Woods", "Acanthaceae", "M", 30.4, 10.4, 12.4, 7.1, "R");
        Peix peix = new Peix("LeBron James", "Congridae", "L", 47.65, 21.57, 8, 4, "Tanzania", "O", 23.14);
        Planta planta2 = new Planta("Goku", "Bonsai", "H", 24.43, 9.23, 9.5, 6.8, "S");
        Peix peix2 = new Peix("Luka Doncic", "Lutjanidae", "M", 86.21, 2.14, 12, 7, "Zimbabwe", "L", 12.58);
        Planta planta3 = new Planta("Vegeta", "Araliaceae", "L", 45.98, -10.25, 10, 5, "B");
        Peix peix3 = new Peix("Homer Simpson", "Soleidae", "H", 321.57, 231.58, 14, 13, "Congo", "W", 7.14);

        organismes.add(peix);
        organismes.add(peix2);
        organismes.add(peix3);
        organismes.add(planta);
        organismes.add(planta2);
        organismes.add(planta3);

        for (Organisme organisme : organismes){
            System.out.println("\nMarge d'acidesa de l'organisme " + organisme.getNom() + ": " + organisme.getPhMinim() + "-" + organisme.getPhMaxim() + ". \n");
            System.out.println("Temperatura acceptable de l'organisme " + organisme.getNom() + ": " + organisme.getTemperaturaMinima() + "-" + organisme.getTemperaturaMaxima() + " ºC. \n");
            if (organisme instanceof Peix){
                if (((Peix) organisme).getDieta().equals("W")){
                    System.out.println("Dieta del peix " + organisme.getNom() + ": Algues. \n");
                }
                else if (((Peix) organisme).getDieta().equals("O")){
                    System.out.println("Dieta del peix " + organisme.getNom() + ": Omnívor. \n");
                }
                else if (((Peix) organisme).getDieta().equals("L")){
                    System.out.println("Dieta del peix " + organisme.getNom() + ": Fulles. \n");
                }
            }

            if (organisme.getTipusLlum().equals("L")){
                System.out.println("L'organisme " + organisme.getNom() + " té unes necessitats baixes de llum. \n");
            }
            else if (organisme.getTipusLlum().equals("M")){
                System.out.println("L'organisme " + organisme.getNom() + " té unes necessitats mitjanes de llum. \n");
            }
            else if (organisme.getTipusLlum().equals("H")){
                System.out.println("L'organisme " + organisme.getNom() + " té unes necessitats altes de llum. \n");
            }

            if (organisme instanceof Planta){
                if (((Planta) organisme).getTipus().equals("S")){
                    System.out.println("La planta " + organisme.getNom() + " es de tipus: Tija. \n");
                }
                else if (((Planta) organisme).getTipus().equals("B")){
                    System.out.println("La planta " + organisme.getNom() + " es de tipus: Bulb. \n");
                }
                else if (((Planta) organisme).getTipus().equals("R")){
                    System.out.println("La planta " + organisme.getNom() + " es de tipus: Arrels. \n");
                }
            }
        }
    }
}
